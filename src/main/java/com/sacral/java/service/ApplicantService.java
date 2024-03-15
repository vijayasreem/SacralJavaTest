package com.sacral.java.service;

import com.sacral.java.repository.ApplicantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicantService {

    private final ApplicantRepository applicantRepository;

    @Autowired
    public ApplicantService(ApplicantRepository applicantRepository) {
        this.applicantRepository = applicantRepository;
    }

    public boolean isEligibleForBankingServices() {
        return applicantRepository.isEligibleForBankingServices();
    }

    public boolean isEligibleForHighLimitCreditScore() {
        return applicantRepository.isEligibleForHighLimitCreditScore();
    }

    public boolean isEligibleForModerateLimitCreditScore() {
        return applicantRepository.isEligibleForModerateLimitCreditScore();
    }

    // Add your methods for document verification and credit evaluation here
}