package com.surf.waiver.web.study.exception

import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody

@ControllerAdvice
class CommonExceptionHandler{

    @ResponseBody
    @ExceptionHandler(ApiException::class)
    fun apiExceptHandler(e : ApiException) : Map<String, *>{
        System.err.println("${e.errorCd}:${e.errorMessage}")
        return mapOf("errorCode" to e.errorCd,
                "errorMessage" to e.errorMessage)
    }

}