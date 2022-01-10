package com.example.ABCBanking.repository;

import com.example.ABCBanking.entity.Account;
import com.example.ABCBanking.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AccountRepository extends JpaRepository<Account, Long> {

    @Query("Select user from Account user where user.customer=:customer")
    Account findByCustomerId(@Param("customer")Customer customer);

    @Query("Select account from Account account where account.accountId=:accountId")
    Account findByAccountId(@Param("accountId") Long accountId);
}
