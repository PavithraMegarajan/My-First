package com.first.controller;

import com.first.model.Family;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/first")
public class firstcontroller {

    private final List<Family> families = new ArrayList<>(
            Arrays.asList( new Family(1,"Pavi",60,"Mother")
                    ,new Family(2,"Ashok",100,"Father"),
            new Family(3,"Achu",100,"Son"),
                    new Family(4,"Hanush",100,"Son")
            ) );


    @GetMapping
    public String getStatus()
    {
        return "Application is running";
    }

    @GetMapping("/details")
    public List<Family> getFamilyDetails()
    {
        return families;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Family> getFamilyDetailsById(@PathVariable Integer id)
    {
        System.out.println("Got hit");
        return families.stream().
                filter(e->e.getId().equals(id))
                .findFirst()
                .map(ResponseEntity ::ok).orElse(ResponseEntity.notFound().build());
    }



}
