package com.codegym.service;

import com.codegym.model.Customer;

public interface CustomerService  {
    Iterable<Customer> findAll();
    void findById(Long id);
    void save(Customer customer);
    void remove(Long id);
}
