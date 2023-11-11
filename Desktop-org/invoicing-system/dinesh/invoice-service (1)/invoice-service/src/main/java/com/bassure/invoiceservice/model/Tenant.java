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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

@Setter
@Getter
//@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "_tenant")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "tenantId")
public class Tenant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tenantId;

//    @NotNull
    private String tenantName;

//    @NotNull
    @Length(min = 10, max = 10)
    private String mobileNum;

//    @NotNull
    @Size(min = 15, max = 15)
    private String gstIn;

//    @NotNull
    @Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}", flags = {Pattern.Flag.CASE_INSENSITIVE})
    private String email;

//    @NotNull
    private String status;

//    @JsonBackReference
    @OneToMany(mappedBy = "tenant", cascade = CascadeType.ALL)
    private List<Client> clients;
}
