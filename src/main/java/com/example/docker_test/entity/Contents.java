package com.example.docker_test.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Contents {

    @Id
    @GeneratedValue
    private Long id;

    private String content;

    public Contents(String content) {
        this.content = content;
    }
}
