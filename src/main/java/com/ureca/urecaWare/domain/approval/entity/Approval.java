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

    @Column(name = "status")
    private String status;

    @Column(name = "approval_date")
    private LocalDateTime approval_date;

    @OneToMany
    @JoinColumn(name = "member_no")
    private Long member_no;
}
