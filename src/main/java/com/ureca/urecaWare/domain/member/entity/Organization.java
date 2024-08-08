package com.ureca.urecaWare.domain.member.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Organization {

    @Id
    @GeneratedValue
    @Column(name = "org_no")
    private Long org_no;

    @Column(name = "org_name")
    private String org_name;

    @Column(name = "parent_no")
    private Long parent_no;

    @OneToMany(mappedBy = "organization")
    @Column(name = "members")
    private List<Member> members = new ArrayList<>();

}
