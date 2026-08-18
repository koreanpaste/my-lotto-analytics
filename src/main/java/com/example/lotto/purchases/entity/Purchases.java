package com.example.lotto.purchases.entity;

import com.example.lotto.global.PurchaseType;
import com.example.lotto.member.entity.Member;
import jakarta.persistence.*;

public class Purchases {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private Integer number1;

    @Column(nullable = false)
    private Integer number2;

    @Column(nullable = false)
    private Integer number3;

    @Column(nullable = false)
    private Integer number4;

    @Column(nullable = false)
    private Integer number5;

    @Column(nullable = false)
    private Integer number6;

    @ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PurchaseType purchaseType;
}
