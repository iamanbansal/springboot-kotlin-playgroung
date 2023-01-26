package com.spring.playground

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface CustomerRepository : JpaRepository<Customer, Int> {
    @Query(value = "SELECT * FROM customer ORDER BY age", nativeQuery = true)
    public fun getCustomerSortByAge(): List<Customer>
}