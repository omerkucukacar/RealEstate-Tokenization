package com.arya.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.*;
import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {

  @Value("jdbc:mysql://localhost:3306/tokenization")
  
  private String dbUrl;

  @Bean
  DataSource getDataSource() {
        return DataSourceBuilder
                .create()
                .url("jdbc:mysql://localhost:3306/tokenization")
                .username("root")
                .password("")
                .build();
    }
}
