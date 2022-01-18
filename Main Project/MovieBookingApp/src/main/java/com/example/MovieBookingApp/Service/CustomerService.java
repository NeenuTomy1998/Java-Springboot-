package com.example.MovieBookingApp.Service;

import com.example.MovieBookingApp.Entity.Customer;
import com.example.MovieBookingApp.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service

public class CustomerService {

    @Autowired
        private CustomerRepository customerRepository;


        public Customer saveCustomer(Customer customer) {
            return customerRepository.save(customer);
        }
    public Customer findCustomerByEmail(String email){
        return customerRepository.findByEmail(email);
    }

    public Customer findById(int id) {
        return customerRepository.getById(id);
    }

    }

