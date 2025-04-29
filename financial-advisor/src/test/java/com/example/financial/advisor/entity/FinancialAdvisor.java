package com.example.financial.advisor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advisorId;

    private String name;

    @OneToMany(mappedBy = "financialAdvisor")
    private List<Client> clients = new ArrayList<>();

    // Getters and Setters
    public Long getAdvisorId() {
        return advisorId;
    }

    public void setAdvisorId(Long advisorId) {
        this.advisorId = advisorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}