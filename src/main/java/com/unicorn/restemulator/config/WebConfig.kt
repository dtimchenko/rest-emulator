package com.unicorn.restemulator.config

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.EnableWebMvc

/**
 * Created by dtimchenko on 10-Aug-17.
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = arrayOf("com.unicorn.restemulator.controller"))
open class WebConfig