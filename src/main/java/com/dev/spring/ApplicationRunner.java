package com.dev.spring;
import com.dev.spring.database.pool.ConnectionPool;
import com.dev.spring.database.repository.CompanyRepository;
import com.dev.spring.database.repository.CrudRepository;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args) {
        try (var context = new ClassPathXmlApplicationContext("application.xml")) {
            var connectionPool = (context.getBean("pool1", ConnectionPool.class));
            System.out.println(connectionPool);
            var companyRepository = context.getBean("companyRepository", CrudRepository.class);
            System.out.println(companyRepository);
        }

    }
}
