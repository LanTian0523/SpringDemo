package org.example.springdemo.model;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String name;
    private Short gender;
    private Short age;
    private String phone;
}
