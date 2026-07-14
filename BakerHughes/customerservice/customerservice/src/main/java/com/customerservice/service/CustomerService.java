package com.customerservice.service;

import com.customerservice.entity.Customer;
import com.customerservice.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {
    @Autowired
    public final CustomerRepository repository;

    public Customer save(Customer customer){
        return repository.save(customer);
    }


    public List<Customer> getAll(){
        return repository.findAll();
    }


}
