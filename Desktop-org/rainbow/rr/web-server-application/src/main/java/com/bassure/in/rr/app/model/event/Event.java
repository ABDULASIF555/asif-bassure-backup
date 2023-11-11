package com.bassure.in.rr.app.model.event;

import com.bassure.in.rr.app.model.program.Program;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
@Table(name = "event")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "event_month")
    private String eventMonth;
    @Column(name = "nomination_start_date")
    private Timestamp nominationStartDate;
    @Column(name = "nomination_end_date")
    private Timestamp nominationEndDate;
    @Column(name = "voting_start_date")
    private Timestamp votingStartDate;
    @Column(name = "voting_end_date")
    private Timestamp votingEndDate;
    @Column(name = "nomination_approval_start_date")
    private LocalDate nominationApprovalStartDate;
    @Column(name = "nomination_approval_end_date")
    private LocalDate nominationApprovalEndDate;

    @ManyToMany
    @JoinTable(
            name = "program_event",
            joinColumns = {
                @JoinColumn(name = "event_id")},
            inverseJoinColumns = {
                @JoinColumn(name = "program_id")}
    )
    List<Program> programList;

}
