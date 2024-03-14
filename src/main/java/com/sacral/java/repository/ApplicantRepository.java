
package com.sacral.java.repository;

import com.sacral.java.model.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant, Long> {

    @Query("SELECT a FROM Applicant a WHERE a.annualIncome >= 30000 AND a.creditScore >= 700")
    Applicant findHighCreditScoreEligible();

    @Query("SELECT a FROM Applicant a WHERE a.annualIncome >= 20000 AND a.creditScore >= 600")
    Applicant findModerateCreditScoreEligible();
}
