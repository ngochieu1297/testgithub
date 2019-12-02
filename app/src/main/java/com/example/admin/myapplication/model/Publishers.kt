package com.example.admin.myapplication.model

import java.sql.Date

data class Publishers(
        private val id: Int,
        private val name: String,
        private val address: String,
        private val phone: String,
        private val created_at: Date? = null,
        private val updated_at: Date? = null
)
