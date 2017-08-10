package com.unicorn.restemulator.service

import com.unicorn.restemulator.util.Utils
import org.springframework.stereotype.Service

/**
 * Created by dtimchenko on 10-Aug-17.
 */

@Service
class FileService {

    fun getJsonFileContent(fileName: String): String {
        return Utils.readFile(fileName)
    }
}