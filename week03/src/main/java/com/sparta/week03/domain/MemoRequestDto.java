package com.sparta.week03.domain;

import lombok.Getter;
@Getter
public class MemoRequestDto { // 필요한 정보를 물고 다님
    private String username; // 보완상 문제로 private
    private String contents;
    private String title;
    private Long password;
}
