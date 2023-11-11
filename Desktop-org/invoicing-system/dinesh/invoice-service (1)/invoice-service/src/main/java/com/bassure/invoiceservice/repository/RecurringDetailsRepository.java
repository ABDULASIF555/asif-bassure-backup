package com.bassure.invoiceservice.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import com.bassure.invoiceservice.model.Recurrence;
public interface RecurringDetailsRepository extends JpaRepository<Recurrence,Integer> 
{
    
}
