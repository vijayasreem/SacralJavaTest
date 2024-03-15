package com.sacral.java.controller;

import com.sacral.java.model.LoanApplication;
import com.sacral.java.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loan-applications")
public class LoanApplicationController {

    private final LoanApplicationService loanApplicationService;

    @Autowired
    public LoanApplicationController(LoanApplicationService loanApplicationService) {
        this.loanApplicationService = loanApplicationService;
    }

    @GetMapping("/{id}")
    public LoanApplication getLoanApplicationById(@PathVariable("id") long id) {
        return loanApplicationService.findById(id);
    }

    @GetMapping
    public List<LoanApplication> getAllLoanApplications() {
        return loanApplicationService.findAll();
    }

    @GetMapping("/customer/{customerId}")
    public List<LoanApplication> getLoanApplicationsByCustomerId(@PathVariable("customerId") long customerId) {
        return loanApplicationService.findByCustomerId(customerId);
    }

    @GetMapping("/channel/{applicationChannel}")
    public List<LoanApplication> getLoanApplicationsByApplicationChannel(@PathVariable("applicationChannel") String applicationChannel) {
        return loanApplicationService.findByApplicationChannel(applicationChannel);
    }

    @GetMapping("/status/{status}")
    public List<LoanApplication> getLoanApplicationsByStatus(@PathVariable("status") String status) {
        return loanApplicationService.findByStatus(status);
    }

    @GetMapping("/accessibility/{accessibilityCompliance}")
    public List<LoanApplication> getLoanApplicationsByAccessibilityCompliance(@PathVariable("accessibilityCompliance") boolean accessibilityCompliance) {
        return loanApplicationService.findByAccessibilityCompliance(accessibilityCompliance);
    }

    @GetMapping("/incomplete")
    public List<LoanApplication> getIncompleteLoanApplications() {
        return loanApplicationService.findIncompleteApplications();
    }

    // Add other methods for handling loan application creation, update, and deletion

}