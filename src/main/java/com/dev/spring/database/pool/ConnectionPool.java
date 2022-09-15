package com.dev.spring.database.pool;

import java.util.List;
import java.util.Map;

public class ConnectionPool {
    private final String username;
    private final Integer poolsize;
    private final List<Object> args;
    private Map<String, Object> properties;

    public ConnectionPool(String username, Integer poolsize,
                          List<Object> args, Map<String, Object> properties) {
        this.username = username;
        this.poolsize = poolsize;
        this.args = args;
        this.properties = properties;
    }
    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }
    private void init() {
        System.out.println("Init connection pool");
    }

    private void destroy() {
        System.out.println("Clean connection pool");
    }
}
