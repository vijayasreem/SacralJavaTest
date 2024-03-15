package com.sacral.java.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "applicant")
public class Applicant {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "credit_bureau")
    private String creditBureau;
    
    @Column(name = "credit_score")
    private int creditScore;
    
    @Column(name = "payment_history")
    private int paymentHistory;
    
    @Column(name = "outstanding_debts")
    private int outstandingDebts;
    
    @Column(name = "annual_income")
    private double annualIncome;
    
    // Getters and Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getCreditBureau() {
        return creditBureau;
    }
    
    public void setCreditBureau(String creditBureau) {
        this.creditBureau = creditBureau;
    }
    
    public int getCreditScore() {
        return creditScore;
    }
    
    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }
    
    public int getPaymentHistory() {
        return paymentHistory;
    }
    
    public void setPaymentHistory(int paymentHistory) {
        this.paymentHistory = paymentHistory;
    }
    
    public int getOutstandingDebts() {
        return outstandingDebts;
    }
    
    public void setOutstandingDebts(int outstandingDebts) {
        this.outstandingDebts = outstandingDebts;
    }
    
    public double getAnnualIncome() {
        return annualIncome;
    }
    
    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }
}