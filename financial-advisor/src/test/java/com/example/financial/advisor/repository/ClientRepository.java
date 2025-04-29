package com.example.financial.advisor.repository;

import com.example.financial.advisor.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {}