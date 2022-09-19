package com.dev.spring.database.repository;

import com.dev.spring.bpp.InjectBean;
import com.dev.spring.database.pool.ConnectionPool;

public class CompanyRepository {
    @InjectBean
    private ConnectionPool connectionPool;

}
