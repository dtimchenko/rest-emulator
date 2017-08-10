package com.unicorn.restemulator.config

import org.springframework.beans.factory.config.PropertiesFactoryBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.io.FileSystemResource

/**
 * Created by dtimchenko on 10-Aug-17.
 */

@Configuration
open class RootConfig {

    @Bean
    open fun properties(): PropertiesFactoryBean {
        val bean = PropertiesFactoryBean()
        bean.setLocation(FileSystemResource("resources/url-json.properties"))
        return bean
    }

}