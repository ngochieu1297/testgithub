package com.example.admin.myapplication.model

import java.sql.Date

data class Promotions(
        private val id: Int,
        private val value: Double,
        private val created_at: Date? = null,
        private val updated_at: Date? = null
)
