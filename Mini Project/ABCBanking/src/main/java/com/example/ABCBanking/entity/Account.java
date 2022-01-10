package com.example.ABCBanking.entity;

import javax.persistence.*;
@Entity
public class Account {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "accountId")
        private Long accountId;
        @Column(name = "accountholdername", nullable = false)
        private String accountHolderName;
        private Double accountBalance;
        @Column(name = "bankname")
        private String bankName;
        private String IFSCCode;
        @Column(name = "branchname")
        private String branchName;
        @OneToOne
        private Customer customer;


        public Account(){

        }
        public Account(String accountHolderName, Double accountBalance, Customer customer, String bankName, String IFSCCode, String branchName) {
                this.accountHolderName = accountHolderName;
                this.accountBalance = accountBalance;
                this.customer = customer;
                this.bankName=bankName;
                this.IFSCCode=IFSCCode;
                this.branchName=branchName;
        }

        public Long getId() {
                return accountId;
        }

        public void setId(Long id) {
                this.accountId = id;
        }

        public String getAccountHolderName() {
                return accountHolderName;
        }

        public void setAccountHolderName(String accountHolderName) {
                this.accountHolderName = accountHolderName;
        }

        public Double getAccountBalance() {
                return accountBalance;
        }

        public void setAccountBalance(Double accountBalance) {
                this.accountBalance = accountBalance;
        }



        public String getBankName() {
                return bankName;
        }

        public void setBankName(String bankName) {
                this.bankName = bankName;
        }

        public String getIFSCCode() {
                return IFSCCode;
        }

        public void setIFSCCode(String IFSCCode) {
                this.IFSCCode = IFSCCode;
        }

        public String getBranchName() {
                return branchName;
        }

        public void setBranchName(String branchName) {
                this.branchName = branchName;
        }

        public Customer getCustomer() {
                return customer;
        }

        public void setCustomer(Customer customer) {
                this.customer = customer;
        }
}
