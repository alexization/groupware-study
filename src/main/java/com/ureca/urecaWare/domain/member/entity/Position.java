package com.ureca.urecaWare.domain.member.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Position {

    @Id
    @GeneratedValue
    @Column(name = "position_no")
    private Long position_no;

    @Column(name = "position_name")
    private String position_name;

    @Column(name = "admin")
    private boolean admin;
}
