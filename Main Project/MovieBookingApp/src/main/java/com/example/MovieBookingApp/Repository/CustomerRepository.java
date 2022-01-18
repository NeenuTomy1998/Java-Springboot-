package com.example.MovieBookingApp.Repository;

import com.example.MovieBookingApp.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer,Integer> {

    @Query("Select user from Customer user where user.email=:email")
    Customer findByEmail(@Param("email") String email);
}
