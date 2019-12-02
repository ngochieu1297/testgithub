package com.example.admin.myapplication.model

import java.sql.Date

data class Prices(
        private val id: Int,
        private val min: Double,
        private val max: Double,
        private val created_at: Date? = null,
        private val updated_at: Date? = null
)
