package com.unicorn.utils;

import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by dtimchenko on 03-Aug-17.
 */
public class Util {

    private static final String RES_FOLDER = "/resources/";
    private static final String DELIMITER = "\\Z";

    public static String readFile(String fileName) throws IOException {
        String dir = System.getProperty("user.dir");
        InputStream is = new FileInputStream(dir + RES_FOLDER + fileName);
        Scanner scanner = new Scanner(is);
        String result = scanner.useDelimiter(DELIMITER).next();
        is.close();
        scanner.close();
        return result;
    }

    public static PrintWriter getResponseWriter(HttpServletResponse response) {
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return writer;
    }
}
