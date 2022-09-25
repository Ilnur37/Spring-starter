package com.dev.spring.service;

import com.dev.spring.database.entity.Company;
import com.dev.spring.database.repository.CompanyRepository;
import com.dev.spring.database.repository.CrudRepository;
import com.dev.spring.database.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServise {
    private final UserRepository userRepository;
    private final CrudRepository<Integer, Company> companyRepository;

    public UserServise(UserRepository userRepository,
                       CrudRepository<Integer, Company> companyRepository) {
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
    }
}
