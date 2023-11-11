package com.bassure.invoiceservice.repository;

import com.bassure.invoiceservice.model.Invoice;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice,Integer>
{
    
    @Query(nativeQuery = false,value = "SELECT i FROM Invoice i WHERE i.client.tenant.tenantId = :tenantId")
    public List<Invoice> findAllByTenantId(Integer tenantId);
    
    @Query(nativeQuery = false,value = "SELECT i FROM Invoice i WHERE i.client.tenant.tenantId = :tenantId AND i.client.clientId = :clientId")
    public List<Invoice> findAllByClientId(Integer tenantId , Integer clientId);

    @Query(nativeQuery = false,value = "SELECT i FROM Invoice i WHERE i.client.tenant.tenantId = :tenantId AND i.client.clientId = :clientId AND i.invoiceId = :invoiceId")
    public Optional<Invoice> findById(Integer tenantId, Integer clientId, Integer invoiceId);
   
    
}

