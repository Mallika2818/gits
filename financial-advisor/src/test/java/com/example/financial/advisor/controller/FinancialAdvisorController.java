package com.example.financial.advisor.controller;

import com.example.financial.advisor.entity.FinancialAdvisor;
import com.example.financial.advisor.service.FinancialAdvisorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/advisors")
public class FinancialAdvisorController {

    @Autowired
    private FinancialAdvisorService advisorService;

    @GetMapping
    public List<FinancialAdvisor> getAllAdvisors() {
        return advisorService.getAllAdvisors();
    }

    @PostMapping
    public FinancialAdvisor createAdvisor(@RequestBody FinancialAdvisor advisor) {
        return advisorService.saveAdvisor(advisor);
    }
}