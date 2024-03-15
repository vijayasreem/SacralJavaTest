package com.sacral.java.controller;

import com.sacral.java.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/applicant")
public class ApplicantController {

    private final ApplicantService applicantService;

    @Autowired
    public ApplicantController(ApplicantService applicantService) {
        this.applicantService = applicantService;
    }

    @GetMapping("/verifyIdentity")
    public String verifyIdentity() {
        // Implement the logic for verifying the applicant's identity
        // Return the appropriate success or failure message
        return "Identity verification successful";
    }

    @GetMapping("/verifyAddress")
    public String verifyAddress() {
        // Implement the logic for verifying the applicant's address
        // Return the appropriate success or failure message
        return "Address verification successful";
    }

    @GetMapping("/documentVerification")
    public String documentVerification() {
        String identityVerificationResult = verifyIdentity();
        String addressVerificationResult = verifyAddress();

        if (identityVerificationResult.equals("Identity verification successful") &&
                addressVerificationResult.equals("Address verification successful")) {
            return "Document verification successful. Eligible for banking services.";
        } else {
            return "Incomplete document verification. Not eligible for banking services.";
        }
    }

    @GetMapping("/evaluateCredit")
    public String evaluateCredit() {
        boolean eligibleForHighLimitCreditScore = applicantService.isEligibleForHighLimitCreditScore();
        boolean eligibleForModerateLimitCreditScore = applicantService.isEligibleForModerateLimitCreditScore();

        if (eligibleForHighLimitCreditScore) {
            return "Congratulations! Eligible for credit score with a high limit.";
        } else if (eligibleForModerateLimitCreditScore) {
            return "Eligible for credit score with a moderate limit.";
        } else {
            return "Not eligible for credit score.";
        }
    }
}