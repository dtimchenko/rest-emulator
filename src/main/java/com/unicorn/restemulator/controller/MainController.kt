package com.unicorn.restemulator.controller

import com.unicorn.restemulator.service.FileService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.io.PrintWriter
import java.util.*
import javax.annotation.Resource
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * Created by dtimchenko on 10-Aug-17.
 */
const val EMPTY_JSON: String = "{}"


@RestController
class MainController @Autowired constructor(val fileService: FileService) {

    @Resource(name = "properties")
    lateinit var properties: Properties

    @RequestMapping(value = "/**")
    fun getResponse(request: HttpServletRequest, response: HttpServletResponse) {
        val requestURI = request.requestURI
        val jsonFile: String = properties.getProperty(requestURI) ?: ""

        val json = if (!jsonFile.isEmpty())
            fileService.getJsonFileContent(jsonFile)
        else
            EMPTY_JSON

        val writer: PrintWriter = response.writer
        response.setHeader("content-type", "application/json")
        writer.write(json)
        writer.close()
    }
}