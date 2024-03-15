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

    public List<LoanApplication> findPendingApplications() {
        return loanApplicationRepository.findPendingApplications();
    }

    public List<LoanApplication> findVerifiedApplications() {
        return loanApplicationRepository.findVerifiedApplications();
    }

    public List<LoanApplication> findRejectedApplications() {
        return loanApplicationRepository.findRejectedApplications();
    }

    public List<LoanApplication> findPendingApplicationsByEmployeeId(Long employeeId) {
        return loanApplicationRepository.findPendingApplicationsByEmployeeId(employeeId);
    }

    public List<LoanApplication> findVerifiedApplicationsByEmployeeId(Long employeeId) {
        return loanApplicationRepository.findVerifiedApplicationsByEmployeeId(employeeId);
    }

    public List<LoanApplication> findRejectedApplicationsByEmployeeId(Long employeeId) {
        return loanApplicationRepository.findRejectedApplicationsByEmployeeId(employeeId);
    }

    public LoanApplication findByApplicantId(Long applicantId) {
        return loanApplicationRepository.findByApplicantId(applicantId);
    }
}