package com.unicorn.controller;

import com.unicorn.service.FileService;
import com.unicorn.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Properties;

/**
 * Created by dtimchenko on 02-Aug-17.
 */

@RestController
public class MainController {

    @Resource(name = "properties")
    private Properties properties;
    private FileService service;

    @Autowired
    public MainController(FileService fileService) {
        this.service = fileService;
    }

    @RequestMapping("/**")
    public void getResponse(HttpServletRequest request, HttpServletResponse response) {
        String requestURI = request.getRequestURI();
        String uri = properties.getProperty(requestURI);

        if (uri != null && !uri.isEmpty()) {
            String json = service.jsonFileContent(uri);
            response.setHeader("content-type", "application/json");
            PrintWriter writer = Util.getResponseWriter(response);
            if (writer != null) {
                writer.write(json);
                writer.close();
            }
        }
    }

//    private String readFile(String name) {
//        InputStream is = getClass().getResourceAsStream("./resources/"+name);
//        InputStreamReader reader = new InputStreamReader(is);
//        return new Scanner(reader).useDelimiter("\\Z").next();
//    }

}
