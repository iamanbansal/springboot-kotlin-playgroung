package com.spring.playground

import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/v1/customers")
class CustomerController(
    private val repository: CustomerRepository
) {
    @GetMapping
    fun getCustomers(@RequestParam sort: String?): List<Customer> {
        return when (sort) {
            "age" -> repository.getCustomerSortByAge()
            else -> repository.findAll()
        }
    }

    @PostMapping
    fun addCustomers(@RequestBody customer: Customer) {
        repository.save(customer)
    }

    @DeleteMapping("/delete")
    fun deleteCustomer(@RequestParam id: Int) {
        repository.deleteById(id)
    }
}