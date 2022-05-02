package com.example.demo.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name="cat")
public class Cat {
    @Id
    private int id;
    private String nickName;
    private String color;
    private int age;

}
