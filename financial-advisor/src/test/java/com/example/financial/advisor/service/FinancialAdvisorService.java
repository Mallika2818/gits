package com.example.financial.advisor.service;

import com.example.financial.advisor.entity.FinancialAdvisor;
import com.example.financial.advisor.repository.FinancialAdvisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancialAdvisorService {

    @Autowired
    private FinancialAdvisorRepository advisorRepository;

    public List<FinancialAdvisor> getAllAdvisors() {
        return advisorRepository.findAll();
    }

    public FinancialAdvisor saveAdvisor(FinancialAdvisor advisor) {
        return advisorRepository.save(advisor);
    }
}