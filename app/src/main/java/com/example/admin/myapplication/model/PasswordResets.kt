package com.example.admin.myapplication.model

import java.sql.Date

data class PasswordResets(
        private val email: String,
        private val token: String,
        private val created_at: Date? = null
)
