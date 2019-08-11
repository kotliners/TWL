package com.surf.waiver.web.study.controller

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("/hello")
class HelloController{
    val log: Logger = LoggerFactory.getLogger(Thread.currentThread().javaClass)

    @Value("\${abt.kot.exam.app.name}")
    private lateinit var applicationName : String

    @GetMapping("/accessName")
    fun accessName(model : Model, @RequestParam(required = false) name : String) : String{
        model["name"] = applicationName
        return "/hello/accessName"
    }

}
