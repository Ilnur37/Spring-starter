package com.dev.spring.database.repository;

import com.dev.spring.bpp.InjectBean;
import com.dev.spring.bpp.Transction;
import com.dev.spring.database.entity.Company;
import com.dev.spring.database.pool.ConnectionPool;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Transction
public class CompanyRepository implements CrudRepository<Integer, Company>{
    @InjectBean
    private ConnectionPool connectionPool;
    @PostConstruct
    private void init() {
        System.out.println("init company repository");
    }

    @Override
    public Optional<Company> findById(Integer id) {
        System.out.println("finalById method...");
        return Optional.of(new Company(id));
    }

    @Override
    public void delete(Company entity) {
        System.out.println("delete method...");
    }
}
