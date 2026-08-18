package com.example.lotto.member.entity;

import com.example.lotto.analytics.entity.Analytics;
import com.example.lotto.round.entity.Draw;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Member {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true, length = 100)
    private String password;

    @Column(nullable = false, unique = true, length = 100)
    private String username;

    @OneToMany(mappedBy = "member")
    private List<Draw> draws;

    @OneToOne(mappedBy = "member")
    private Analytics analytics;
}
