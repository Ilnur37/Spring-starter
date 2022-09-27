package com.dev.spring.service;

import com.dev.spring.database.entity.Company;
import com.dev.spring.database.repository.CrudRepository;
import com.dev.spring.database.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final CrudRepository<Integer, Company> companyRepository;

}
