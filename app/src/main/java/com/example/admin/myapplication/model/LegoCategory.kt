package com.example.admin.myapplication.model

import java.sql.Date

data class LegoCategory(
        private val id: Int,
        private val category_id: Int,
        private val lego_id: Int,
        private val created_at: Date ?= null,
        private val updated_at: Date ?= null
)
