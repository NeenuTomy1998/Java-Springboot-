package com.example.ABCBanking.service;

import com.example.ABCBanking.entity.Account;
import com.example.ABCBanking.entity.Customer;
import com.example.ABCBanking.repository.AccountRepository;
import com.example.ABCBanking.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private AccountRepository accountRepo;


    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public Customer findCustomerByEmail(String email){
        return customerRepository.findByEmail(email);
    }

    public Customer getCustomerById(Long id){
        return  customerRepository.getById(id);
    }

    public Account saveAccount(Account account) {
        return accountRepo.save(account);
    }
    public Account getAccountByCustomerId(Customer customer) {
        return accountRepo.findByCustomerId(customer);
    }

    public Account getAccountByAccountId(Long accountId){
        return accountRepo.findByAccountId(accountId);
    }

    public List<Customer> listOfCustomers() {
         return customerRepository.findAll();

    }
}
