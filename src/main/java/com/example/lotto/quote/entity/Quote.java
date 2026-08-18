package com.example.lotto.quote.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Quote {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false,length = 500)
    private String content;

    @Column(nullable = false, length = 50)
    private String writer;
}
