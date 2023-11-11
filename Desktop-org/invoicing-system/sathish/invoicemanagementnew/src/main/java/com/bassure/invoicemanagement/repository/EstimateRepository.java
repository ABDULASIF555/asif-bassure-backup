/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bassure.invoicemanagement.repository;

import com.bassure.invoicemanagement.model.Estimate;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author bas200190
 */
@Repository
public interface EstimateRepository extends JpaRepository<Estimate,Integer> {

    
    @Query(nativeQuery = false,value = "SELECT e FROM Estimate e WHERE e.client.tenant.tenantId = :tenantId")
    public List<Estimate> findAllByTenantId(Integer tenantId);
    
    @Query(nativeQuery = false,value = "SELECT e FROM Estimate e WHERE e.client.tenant.tenantId = :tenantId AND e.client.clientId = :clientId")
    public List<Estimate> findAllByClientId(Integer tenantId , Integer clientId);

    @Query(nativeQuery = false,value = "SELECT e FROM Estimate e WHERE e.client.tenant.tenantId = :tenantId AND e.client.clientId = :clientId AND e.estimateId = :estimateId")
    public Optional<Estimate> findByEstimateId(Integer tenantId, Integer clientId, Integer estimateId);



    
    
}
