package com.bassure.invoiceservice.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
//@ToString
@Entity
@Table(name = "invoice_content")
@JsonIdentityInfo(
   generator = ObjectIdGenerators.PropertyGenerator.class,
   property = "invoiceContentId")
public class InvoiceContent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer invoiceContentId;

//    @JsonBackReference
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "invoiceId")
    private Invoice invoice;

    @JoinColumn(name = "resourceId")
    @OneToOne(cascade = CascadeType.ALL)
    private Resource resource;

    @NotNull
    private Integer quantityOrHours;

    @NotNull
    private BigDecimal rate;

    private Double discountPercentage;
}
