package com.example.financial.advisor.repository;

import com.example.financial.advisor.entity.Security;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecurityRepository extends JpaRepository<Security, Long> {}