package com.unicorn.restemulator.util

import java.io.FileInputStream
import java.io.InputStream
import java.util.*

/**
 * Created by dtimchenko on 10-Aug-17.
 */
const val RES_FOLDER: String = "/resources/"
const val DELIMITER: String = "\\Z"


class Utils {
    companion object Files {
        fun readFile(fileName: String): String {
            val dir = System.getProperty("user.dir")
            val stream: InputStream = FileInputStream(dir + RES_FOLDER + fileName)
            val scanner: Scanner = Scanner(stream)
            val content = scanner.useDelimiter(DELIMITER).next()
            stream.close()
            scanner.close()
            return content
        }
    }

}