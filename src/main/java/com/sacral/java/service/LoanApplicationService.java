package com.sacral.java.service;

import com.sacral.java.model.LoanApplication;
import com.sacral.java.repository.LoanApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanApplicationService {

    private final LoanApplicationRepository loanApplicationRepository;

    @Autowired
    public LoanApplicationService(LoanApplicationRepository loanApplicationRepository) {
        this.loanApplicationRepository = loanApplicationRepository;
    }

    public LoanApplication findById(long id) {
        return loanApplicationRepository.findById(id);
    }

    public List<LoanApplication> findAll() {
        return loanApplicationRepository.findAll();
    }

    public List<LoanApplication> findByCustomerId(long customerId) {
        return loanApplicationRepository.findByCustomerId(customerId);
    }

    public List<LoanApplication> findByApplicationChannel(String applicationChannel) {
        return loanApplicationRepository.findByApplicationChannel(applicationChannel);
    }

    public List<LoanApplication> findByStatus(String status) {
        return loanApplicationRepository.findByStatus(status);
    }

    public List<LoanApplication> findByAccessibilityCompliance(boolean accessibilityCompliance) {
        return loanApplicationRepository.findByAccessibilityCompliance(accessibilityCompliance);
    }

    public List<LoanApplication> findIncompleteApplications() {
        return loanApplicationRepository.findIncompleteApplications();
    }
}
