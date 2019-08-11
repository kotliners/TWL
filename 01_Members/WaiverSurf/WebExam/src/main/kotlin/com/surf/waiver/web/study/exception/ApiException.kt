package com.surf.waiver.web.study.exception

class ApiException(val errorCd: String, val errorMessage: String = "") : RuntimeException(errorMessage) {
    override fun getLocalizedMessage(): String {
        return "${errorCd} is ${errorMessage}"
    }
}
