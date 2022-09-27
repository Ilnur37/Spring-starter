package com.dev.spring.database.repository;

import com.dev.spring.bpp.Auditing;
import com.dev.spring.bpp.InjectBean;
import com.dev.spring.bpp.Transction;
import com.dev.spring.database.entity.Company;
import com.dev.spring.database.pool.ConnectionPool;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Repository
@Transction
@Auditing
@RequiredArgsConstructor
public class CompanyRepository implements CrudRepository<Integer, Company>{
    private final ConnectionPool pool1;
    private final List<ConnectionPool> pools;
    @Value("${db.pool.size}")
    private final Integer pollSize;


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
