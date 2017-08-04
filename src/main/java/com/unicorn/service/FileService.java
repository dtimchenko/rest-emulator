package com.unicorn.service;

import com.unicorn.utils.Util;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by dtimchenko on 03-Aug-17.
 */
@Service
public class FileService {

    public String jsonFileContent(String fileName) {
        String jsonContent = "";
        try {
            jsonContent = Util.readFile(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonContent;
    }
}
