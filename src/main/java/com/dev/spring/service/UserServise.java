package com.dev.spring.service;

import com.dev.spring.database.repository.CompanyRepository;
import com.dev.spring.database.repository.UserRepository;

public class UserServise {

    private final UserRepository userRepository;
    private final CompanyRepository companyRepository;

    public UserServise(UserRepository userRepository,
                       CompanyRepository companyRepository) {
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
    }
}
