package com.example.temansembuh.model.service

import javax.inject.Inject


class UserRepository @Inject constructor(
    private val userDao: UserDatabaseDAO
) {
    val getAllData = userDao.getAlldata()
}