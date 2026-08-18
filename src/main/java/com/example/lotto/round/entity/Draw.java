package com.example.lotto.round.entity;

import com.example.lotto.member.entity.Member;
import com.example.lotto.purchases.entity.Purchases;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

public class Draw {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private Integer round;

    @Column(nullable = false)
    private LocalDate drawDate;

    @Column(nullable = true)
    private String winningNumber;

    @ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @OneToMany(mappedBy = "draw")
    private List<Purchases> purchase;
}
