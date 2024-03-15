package com.sacral.java.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoanApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long customerId;
    private String applicationChannel;
    private String status;
    private boolean accessibilityCompliance;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getApplicationChannel() {
        return applicationChannel;
    }

    public void setApplicationChannel(String applicationChannel) {
        this.applicationChannel = applicationChannel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isAccessibilityCompliance() {
        return accessibilityCompliance;
    }

    public void setAccessibilityCompliance(boolean accessibilityCompliance) {
        this.accessibilityCompliance = accessibilityCompliance;
    }
}