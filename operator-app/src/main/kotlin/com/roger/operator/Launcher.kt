package com.roger.operator

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class Launcher {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            runApplication<Launcher>(*args)
        }
    }

}