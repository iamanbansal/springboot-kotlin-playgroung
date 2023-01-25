package com.spring.playground.model

import jakarta.persistence.*


@Entity
data class Customer(

    @Id
    @SequenceGenerator(
        name = "customer_id"
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "customer_id"
    )
    val id: Int? = null,

    val name: String? = null,
    val email: String? = null,
    val age: Int? = null
)
