package com.SpringJDBC1;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@PropertySource("classpath:application.properties")
@Configuration
public class DBConfiguration {
@Value("${jdbc.driver}")
private String driverClassName;
@Value("${jdbc.url}")
private String url;
@Value("${jdbc.user}")
private String username;
@Value("${jdbc.password}")
private String password;

public JdbcTemplate getJdbcTemplate(){
JdbcTemplate jt = null;

    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName(driverClassName);
    dataSource.setUrl(url);
    dataSource.setUsername(username);
    dataSource.setPassword(password);
jt = new JdbcTemplate(dataSource);

return jt;
}
    // to resolve ${} in @ value
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
