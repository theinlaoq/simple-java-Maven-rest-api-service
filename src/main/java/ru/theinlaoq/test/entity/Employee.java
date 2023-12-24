package ru.theinlaoq.test.entity;


import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private String name;
    private String surname;
    private int age;
}
