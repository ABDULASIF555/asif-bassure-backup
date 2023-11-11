
package com.bassure.invoiceservice.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
//@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="_recurrence")
@JsonIdentityInfo(
   generator = ObjectIdGenerators.PropertyGenerator.class,
   property = "recurrenceId")
public class Recurrence {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer recurrenceId;
    @NotNull
    @Enumerated(EnumType.STRING)
    private RecurringFrequency recurringFrequency;
}
