package com.first.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Family {
    private Integer id;
    private String name;
    private Integer age;
    private String relationship;
}
