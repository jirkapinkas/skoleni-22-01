package com.example.demonativeexternal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatasourceConfiguration {

    @Bean
    public String dataSource() {
        return "String"; // TODO ...
    }

}
