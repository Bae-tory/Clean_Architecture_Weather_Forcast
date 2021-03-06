package com.sungjae.weather_forcast.repository.remote

object RemoteConstant {

    const val CACHE_SIZE = (10 * 1024 * 1024).toLong()

    /* Retrofit Time Out */
    const val CONNECT_TIME_OUT = 30L
    const val READ_TIME_OUT = 10L
    const val WRITE_TIME_OUT = 10L
    const val CALL_TIME_OUT = 10L

}