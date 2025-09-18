package com.example.Event_Management.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import javax.sql.DataSource;

@Component
public class DatabaseTestRunner implements CommandLineRunner {

    @Autowired
    private DataSource dataSource;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("✅ Connected to: " + dataSource.getConnection().getMetaData().getURL());
    }
}
