package com.sacral.java.service;

import com.sacral.java.model.Applicant;
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
    
    // Method to retrieve the applicant's credit score from a reliable credit bureau
    public Applicant getApplicantByCreditBureau(String creditBureau) {
        return applicantRepository.findByCreditBureau(creditBureau);
    }
    
    // Method to calculate a creditworthiness score based on the credit score and financial history
    public Double calculateCreditworthinessScore(Long id) {
        return applicantRepository.calculateCreditworthinessScore(id);
    }
    
    // Method to compare the creditworthiness score against predetermined thresholds
    public String checkCreditLimit(Long id) {
        return applicantRepository.checkCreditLimit(id);
    }
    
    // Method to check if the applicant meets the bank's creditworthiness criteria
    public Boolean checkEligibility(Long id) {
        return applicantRepository.checkEligibility(id);
    }
}