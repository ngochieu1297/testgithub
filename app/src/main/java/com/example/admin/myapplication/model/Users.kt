package com.example.admin.myapplication.model

import java.sql.Date

data class Users(
        private val id: Int,
        private val username: String,
        private val password: String,
        private val email: String,
        private val name: String,
        private val birthday: Date,
        private val address: String,
        private val phone: String,
        private val role: Int,
        private val remember_token: String,
        private val created_at: Date? = null,
        private val updated_at: Date? = null
)
