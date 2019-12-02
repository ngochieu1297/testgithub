package com.example.admin.myapplication.model

data class Migrations(
        private val id: Int,
        private val migration: String,
        private val batch: Int
)
