package com.lynas

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class BasicBootApplication

fun main(args: Array<String>) {
    SpringApplication.run(BasicBootApplication::class.java, *args)
}


@RestController
class HomeController {


    @GetMapping(value = "/")
    fun doingGet() : String{
        return "Ok"
    }
}