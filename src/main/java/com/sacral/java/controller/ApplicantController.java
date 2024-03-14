package com.sacral.java.controller;

import com.sacral.java.model.Applicant;
import com.sacral.java.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/applicants")
public class ApplicantController {

    private final ApplicantService applicantService;

    @Autowired
    public ApplicantController(ApplicantService applicantService) {
        this.applicantService = applicantService;
    }

    @GetMapping("/high-credit-score-eligible")
    public Applicant findHighCreditScoreEligible() {
        return applicantService.findHighCreditScoreEligible();
    }

    @GetMapping("/moderate-credit-score-eligible")
    public Applicant findModerateCreditScoreEligible() {
        return applicantService.findModerateCreditScoreEligible();
    }
}