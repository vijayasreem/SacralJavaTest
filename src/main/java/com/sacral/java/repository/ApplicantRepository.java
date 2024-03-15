
package com.sacral.java.repository;

import com.sacral.java.model.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant, Long> {
    // Method to retrieve the applicant's credit score from a reliable credit bureau
    Applicant findByCreditBureau(String creditBureau);

    // Method to calculate a creditworthiness score based on the credit score and financial history
    @Query("SELECT (a.creditScore * 0.5) + (a.paymentHistory * 0.3) + (a.outstandingDebts * 0.2) AS creditworthinessScore FROM Applicant a WHERE a.id = :id")
    Double calculateCreditworthinessScore(Long id);

    // Method to compare the creditworthiness score against predetermined thresholds
    @Query("SELECT CASE WHEN ac.creditworthinessScore >= 700 THEN 'High Limit' WHEN ac.creditworthinessScore >= 600 THEN 'Moderate Limit' ELSE 'Low Limit' END AS creditLimit FROM Applicant ac WHERE ac.id = :id")
    String checkCreditLimit(Long id);

    // Method to check if the applicant meets the bank's creditworthiness criteria
    @Query("SELECT CASE WHEN ac.annualIncome >= 30000 AND ac.creditScore >= 700 THEN true WHEN ac.annualIncome >= 20000 AND ac.creditScore >= 600 THEN true ELSE false END AS eligibility FROM Applicant ac WHERE ac.id = :id")
    Boolean checkEligibility(Long id);
}
