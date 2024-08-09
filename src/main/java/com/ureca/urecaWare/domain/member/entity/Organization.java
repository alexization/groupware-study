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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_org_no")
    private Organization parent;

    @OneToMany(mappedBy = "parent")
    private List<Organization> children = new ArrayList<>();
}
