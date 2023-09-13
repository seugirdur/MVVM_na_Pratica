package com.example.mvvm_na_pratica.repositories

import com.example.mvvm_na_pratica.rest.RetrofitService

class MainRepository constructor(private val retrofitService: RetrofitService) {

    fun getAllLives() = retrofitService.getAllLives()

}