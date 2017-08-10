package com.unicorn.restemulator.config

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer

/**
 * Created by dtimchenko on 10-Aug-17.
 */
class Initializer : AbstractAnnotationConfigDispatcherServletInitializer() {
    override fun getRootConfigClasses(): Array<Class<*>> {
        return arrayOf(RootConfig::class.java)
    }

    override fun getServletMappings(): Array<String> {
        return arrayOf("/")
    }

    override fun getServletConfigClasses(): Array<Class<*>> {
        return arrayOf(WebConfig::class.java)
    }
}