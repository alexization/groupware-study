package com.ureca.urecaWare.domain.approval.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
public class Approval {

    @Id @GeneratedValue
    @Column(name = "doc_no")
    private Long doc_no;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;

    @Column(name = "approval_date")
    private LocalDateTime approval_date;
}
