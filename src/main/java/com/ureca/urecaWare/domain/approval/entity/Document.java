package com.ureca.urecaWare.domain.approval.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
public class Document {

    @Id
    @GeneratedValue
    @Column(name = "doc_no")
    private Long doc_no;

    @Column(name = "doc_title")
    private String doc_Title;

    @Column(name = "doc_content")
    private String doc_content;

    @Column(name = "doc_regdate")
    private LocalDateTime doc_regdate;

    @Column(name = "doc_update")
    private LocalDateTime doc_update;
}
