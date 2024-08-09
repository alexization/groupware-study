package com.ureca.urecaWare.domain.approval.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
public class Approval {

    @Id
    private Long apploval_no;

    @MapsId(value = "apploval_no")
    @OneToOne(targetEntity = Document.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "doc_no")
    private Document document;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;

    @Column(name = "approval_date")
    private LocalDateTime approval_date;
}
