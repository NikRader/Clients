package com.example.Clients.model;

import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Client {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String email;
    private int age;
}
