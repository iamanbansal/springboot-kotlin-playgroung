package com.spring.playground

import jakarta.persistence.*


@Entity
data class Customer(
    @Id
    @GeneratedValue
    val id: Int? = null,
    val name: String? = null,
    val email: String? = null,
    val age: Int? = null
)
