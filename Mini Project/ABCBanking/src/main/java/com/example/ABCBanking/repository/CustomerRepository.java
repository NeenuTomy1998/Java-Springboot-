package com.example.ABCBanking.repository;


import com.example.ABCBanking.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    //Customer findByEmail(String email);
    @Query("Select user from Customer user where user.email=:email")
    Customer findByEmail(@Param("email") String email);

}
