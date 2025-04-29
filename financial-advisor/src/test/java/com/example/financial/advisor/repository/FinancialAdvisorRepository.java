package com.example.financial.advisor.repository;

import com.example.financial.advisor.entity.FinancialAdvisor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinancialAdvisorRepository extends JpaRepository<FinancialAdvisor, Long> {}