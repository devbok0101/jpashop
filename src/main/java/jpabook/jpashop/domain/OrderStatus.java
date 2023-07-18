package jpabook.jpashop.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum OrderStatus {
    ORDER("주문"),
    CANCEL("취소");

    private final String koreanComment;
}
