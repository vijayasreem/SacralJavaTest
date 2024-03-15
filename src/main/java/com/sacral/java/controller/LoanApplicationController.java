package com.sacral.java.controller;

import com.sacral.java.model.LoanApplication;
import com.sacral.java.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/loan-applications")
public class LoanApplicationController {

    private final LoanApplicationService loanApplicationService;

    @Autowired
    public LoanApplicationController(LoanApplicationService loanApplicationService) {
        this.loanApplicationService = loanApplicationService;
    }

    @GetMapping("/pending")
    public List<LoanApplication> getPendingApplications() {
        return loanApplicationService.findPendingApplications();
    }

    @GetMapping("/verified")
    public List<LoanApplication> getVerifiedApplications() {
        return loanApplicationService.findVerifiedApplications();
    }

    @GetMapping("/rejected")
    public List<LoanApplication> getRejectedApplications() {
        return loanApplicationService.findRejectedApplications();
    }

    @GetMapping("/pending/{employeeId}")
    public List<LoanApplication> getPendingApplicationsByEmployeeId(@PathVariable Long employeeId) {
        return loanApplicationService.findPendingApplicationsByEmployeeId(employeeId);
    }

    @GetMapping("/verified/{employeeId}")
    public List<LoanApplication> getVerifiedApplicationsByEmployeeId(@PathVariable Long employeeId) {
        return loanApplicationService.findVerifiedApplicationsByEmployeeId(employeeId);
    }

    @GetMapping("/rejected/{employeeId}")
    public List<LoanApplication> getRejectedApplicationsByEmployeeId(@PathVariable Long employeeId) {
        return loanApplicationService.findRejectedApplicationsByEmployeeId(employeeId);
    }

    @GetMapping("/{applicantId}")
    public LoanApplication getLoanApplicationByApplicantId(@PathVariable Long applicantId) {
        return loanApplicationService.findByApplicantId(applicantId);
    }
}