package com.dev.spring.config;

import com.dev.spring.database.pool.ConnectionPool;
import com.dev.spring.database.repository.CrudRepository;
import com.dev.spring.database.repository.UserRepository;
import com.dev.web.WebCofiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Component;

@Import(WebCofiguration.class)
@Configuration()
public class ApplicationConfiguration {

    @Bean("pool2")
    @Scope(BeanDefinition.SCOPE_SINGLETON)
    public ConnectionPool pool2(@Value("${db.username}") String username) {
        return new ConnectionPool(username, 20);
    }

    @Bean
    public ConnectionPool pool3() {
        return new ConnectionPool("test-pool", 25);
    }

    @Bean
    @Profile("prod")
    public UserRepository userRepository2 (ConnectionPool pool2) {
        return new UserRepository(pool2);
    }

    @Bean
    public UserRepository userRepository3 (ConnectionPool pool2) {
        return new UserRepository(pool3());
    }
}
