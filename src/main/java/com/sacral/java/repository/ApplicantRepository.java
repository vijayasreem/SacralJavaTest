
package com.sacral.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.sacral.java.model.Applicant;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant, Long> {

    @Query("SELECT CASE WHEN COUNT(a) > 0 THEN true ELSE false END FROM Applicant a WHERE a.identityVerified = true AND a.addressVerified = true")
    boolean isEligibleForBankingServices();

    @Query("SELECT CASE WHEN COUNT(a) > 0 THEN true ELSE false END FROM Applicant a WHERE a.annualIncome >= 30000 AND a.creditScore >= 700")
    boolean isEligibleForHighLimitCreditScore();

    @Query("SELECT CASE WHEN COUNT(a) > 0 THEN true ELSE false END FROM Applicant a WHERE a.annualIncome >= 20000 AND a.creditScore >= 600")
    boolean isEligibleForModerateLimitCreditScore();
}
