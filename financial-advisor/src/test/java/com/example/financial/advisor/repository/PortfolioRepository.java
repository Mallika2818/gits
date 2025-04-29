package com.example.financial.advisor.repository;

import com.example.financial.advisor.entity.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {}