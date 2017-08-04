package com.unicorn.config;

import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

/**
 * Created by dtimchenko on 02-Aug-17.
 */

@Configuration
public class RootConfig {

    @Bean(name = "properties")
    public static PropertiesFactoryBean properties(){
        PropertiesFactoryBean bean = new PropertiesFactoryBean();
        bean.setLocation(new FileSystemResource("resources/url-json.properties"));
        return bean;
    }
}
