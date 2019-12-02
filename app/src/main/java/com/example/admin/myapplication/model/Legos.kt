package com.example.admin.myapplication.model

import java.sql.Date

data class Legos(
        private val id: Int,
        private val name: String,
        private val author: String,
        private val quantity: Int,
        private val price: Double,
        private val image: String,
        private val publisher_id: Int,
        private val promotion_id: Int,
        private val summary: String,
        private val detail: String,
        private val created_at: Date ?= null,
        private val updated_at: Date ?= null,
        private val prices_id: Int
)
