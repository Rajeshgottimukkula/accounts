package com.example.accounts.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Accounts extends BaseEntity{


    @Column(name="customer_id")
    private Long customerId;


    @Id
    private Long accountNumber;


    private String email;


    @Column(name="mobile_number")
    private String mobileNumber;

    @Column(name="account_type")
    private String accountType;



}
