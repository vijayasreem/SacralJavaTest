
package com.sacral.java.repository;

import com.sacral.java.model.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {

    // Method to retrieve a loan application by its ID
    LoanApplication findById(long id);

    // Method to retrieve all loan applications
    List<LoanApplication> findAll();

    // Method to retrieve loan applications by customer ID
    List<LoanApplication> findByCustomerId(long customerId);

    // Method to retrieve loan applications by application channel
    List<LoanApplication> findByApplicationChannel(String applicationChannel);

    // Method to retrieve loan applications by status
    List<LoanApplication> findByStatus(String status);

    // Method to retrieve loan applications by accessibility compliance
    List<LoanApplication> findByAccessibilityCompliance(boolean accessibilityCompliance);

    // Method to retrieve loan applications with incomplete applications
    @Query("SELECT la FROM LoanApplication la WHERE la.status <> 'COMPLETED'")
    List<LoanApplication> findIncompleteApplications();
}
