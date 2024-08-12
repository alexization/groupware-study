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
    private Long memberNo;

    @Column(name = "member_name")
    private String memberName;

    @Column(name = "member_id")
    private String memberId;

    @Column(name = "member_pw")
    private String memberPw;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "position_no")
    private Position positionNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "org_no")
    private Organization orgNo;

    @OneToMany
    @JoinColumn(name = "doc_no")
    private List<Document> documents = new ArrayList<>();
}
