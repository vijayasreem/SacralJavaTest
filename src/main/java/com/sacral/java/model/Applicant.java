
package com.sacral.java.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Applicant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private int annualIncome;
    private int creditScore;
    
    // Getters and Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAnnualIncome() {
        return annualIncome;
    }
    
    public void setAnnualIncome(int annualIncome) {
        this.annualIncome = annualIncome;
    }
    
    public int getCreditScore() {
        return creditScore;
    }
    
    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }
}
