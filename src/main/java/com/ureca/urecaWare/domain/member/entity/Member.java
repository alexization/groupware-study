package com.ureca.urecaWare.domain.member.entity;

import jakarta.persistence.*;
import lombok.Getter;

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
}
