package com.bassure.in.rr.app.model.program;

import com.bassure.in.rr.app.model.User;
import com.bassure.in.rr.app.model.event.Event;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Builder;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
@Table(name="program")
@Builder
public class Program {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Program Name Should Not Be Empty")
    private String programName;

    @Enumerated(EnumType.STRING)
    private ProgramType programType;

    private String description;

    @Enumerated(EnumType.STRING)
    private ProgramStatus status;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "created_by", referencedColumnName = "user_id")
    private User createdBy;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "updated_by", referencedColumnName = "user_id")
    private User updatedBy;
    
     @ManyToMany
    @JoinTable(
       name="program_event",
       joinColumns = {@JoinColumn(name = "program_id")},
       inverseJoinColumns={@JoinColumn(name = "event_id")}
        )        
    List<Event> event;
}




    

