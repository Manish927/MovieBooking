package com.spring5.movieservice.domain.service;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private int UserID;
    private String name;
    private String email;
    private String phone;
    private String serviceAddress;

    User() {
        UserID = 0;
        name = null;
        email = null;
        phone = null;
        serviceAddress = null;
    }
}
