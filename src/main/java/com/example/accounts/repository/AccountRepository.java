package com.example.accounts.repository;

import com.example.accounts.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountRepository extends JpaRepository<Accounts,Long> {
}
