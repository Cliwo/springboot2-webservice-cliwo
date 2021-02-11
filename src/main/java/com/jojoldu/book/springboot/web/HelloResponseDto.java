package com.jojoldu.book.springboot.web;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HelloResponseDto { //Dao 에서 꺼내오는 Data를 객체화 한 것 (Dto)
    private final String name;
    private final int amount;
}
