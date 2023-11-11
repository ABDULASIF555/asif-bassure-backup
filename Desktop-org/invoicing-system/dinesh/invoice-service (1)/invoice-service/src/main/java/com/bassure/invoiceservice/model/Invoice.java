package com.bassure.invoiceservice.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;

@Getter
@Setter
//@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "invoice")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "invoiceId")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer invoiceId;

    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "clientId")
    private Client client;

    @NotNull
    @Enumerated(EnumType.STRING)
    private InvoiceType invoiceType;

    @NotNull
    @CreatedDate
    private LocalDate invoiceCreatedAt;

    @NotNull
    private LocalDate invoiceDueDate;

    @NotNull
    private Boolean recurring;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "recurrenceId")
    private Recurrence recurrence;

    
    private BigDecimal totalAmount;

    private LocalDate reccurenceStartedAt;

    private LocalDate reccurenceEndedAt;

    @NotNull
    @Enumerated(EnumType.STRING)
    private InvoiceStatus InvoiceStatus;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invoice")
    private List<InvoiceContent> invoiceContent;
}
