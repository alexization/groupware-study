package com.ureca.urecaWare.domain.member.entity;

import com.ureca.urecaWare.domain.approval.entity.Approval;
import com.ureca.urecaWare.domain.approval.entity.Document;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_no")
    private Long member_no;

    @Column(name = "member_name")
    private String member_name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "position_no")
    private Position position;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "org_no")
    private Organization organization;

    @OneToMany
    @JoinColumn(name = "approval_no")
    private List<Approval> approvals = new ArrayList<>();

    @OneToMany
    @JoinColumn(name = "doc_no")
    private List<Document> documents = new ArrayList<>();
}
