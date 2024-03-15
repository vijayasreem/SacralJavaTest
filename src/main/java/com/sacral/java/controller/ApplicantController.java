package com.sacral.java.controller;

import com.sacral.java.model.Applicant;
import com.sacral.java.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicantController {
    
    private final ApplicantService applicantService;
    
    @Autowired
    public ApplicantController(ApplicantService applicantService) {
        this.applicantService = applicantService;
    }
    
    @GetMapping("/applicant/{creditBureau}")
    public Applicant getApplicantByCreditBureau(@PathVariable String creditBureau) {
        return applicantService.getApplicantByCreditBureau(creditBureau);
    }
    
    @GetMapping("/applicant/creditworthiness/{id}")
    public Double calculateCreditworthinessScore(@PathVariable Long id) {
        return applicantService.calculateCreditworthinessScore(id);
    }
    
    @GetMapping("/applicant/check-credit-limit/{id}")
    public String checkCreditLimit(@PathVariable Long id) {
        return applicantService.checkCreditLimit(id);
    }
    
    @GetMapping("/applicant/check-eligibility/{id}")
    public Boolean checkEligibility(@PathVariable Long id) {
        return applicantService.checkEligibility(id);
    }
}