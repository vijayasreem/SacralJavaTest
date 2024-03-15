
package com.sacral.java.repository;

import com.sacral.java.model.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {

    @Query("SELECT la FROM LoanApplication la WHERE la.verificationStatus = 'PENDING'")
    List<LoanApplication> findPendingApplications();

    @Query("SELECT la FROM LoanApplication la WHERE la.verificationStatus = 'VERIFIED'")
    List<LoanApplication> findVerifiedApplications();

    @Query("SELECT la FROM LoanApplication la WHERE la.verificationStatus = 'REJECTED'")
    List<LoanApplication> findRejectedApplications();

    @Query("SELECT la FROM LoanApplication la WHERE la.verificationStatus = 'PENDING' AND la.employeeId = ?1")
    List<LoanApplication> findPendingApplicationsByEmployeeId(Long employeeId);

    @Query("SELECT la FROM LoanApplication la WHERE la.verificationStatus = 'VERIFIED' AND la.employeeId = ?1")
    List<LoanApplication> findVerifiedApplicationsByEmployeeId(Long employeeId);

    @Query("SELECT la FROM LoanApplication la WHERE la.verificationStatus = 'REJECTED' AND la.employeeId = ?1")
    List<LoanApplication> findRejectedApplicationsByEmployeeId(Long employeeId);

    @Query("SELECT la FROM LoanApplication la WHERE la.applicantId = ?1")
    LoanApplication findByApplicantId(Long applicantId);
}
