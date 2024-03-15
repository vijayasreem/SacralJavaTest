
package com.sacral.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sacral.java.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query("SELECT c FROM Customer c WHERE c.identityVerification = 'yes' AND c.addressVerification = 'yes'")
    List<Customer> findEligibleCustomers();

    @Query("SELECT c FROM Customer c WHERE c.identityVerification = 'no' OR c.addressVerification = 'no'")
    List<Customer> findIncompleteCustomers();

}
