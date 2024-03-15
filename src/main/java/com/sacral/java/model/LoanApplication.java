
package com.sacral.java.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "loan_application")
public class LoanApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "verification_status")
    private String verificationStatus;

    @Column(name = "employee_id")
    private Long employeeId;

    @Column(name = "applicant_id")
    private Long applicantId;

    // Getters and setters
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(Long applicantId) {
        this.applicantId = applicantId;
    }

    // Equals and hashCode methods
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoanApplication that = (LoanApplication) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(verificationStatus, that.verificationStatus) &&
                Objects.equals(employeeId, that.employeeId) &&
                Objects.equals(applicantId, that.applicantId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, verificationStatus, employeeId, applicantId);
    }
}
