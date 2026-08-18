package com.example.lotto.analytics.entity;

import com.example.lotto.member.entity.Member;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Analytics {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private Long totalPurchaseAmount;

    @Column(nullable = false)
    private Long totalPrizeAmount;

    @Column(nullable = false)
    private Integer totalPurchaseCount;

    @Column(nullable = false)
    private Integer totalWinCount;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @OneToOne
    @JoinColumn(name = "member_id", nullable = false, unique = true)
    private Member member;
}
