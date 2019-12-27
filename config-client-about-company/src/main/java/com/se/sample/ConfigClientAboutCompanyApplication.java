package com.se.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@SpringBootApplication
public class ConfigClientAboutCompanyApplication implements CommandLineRunner {

    @Autowired
    DataSource dataSource;


    public static void main(String[] args) {
        SpringApplication.run(ConfigClientAboutCompanyApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Our DataSource is = " + dataSource);

    }

}
