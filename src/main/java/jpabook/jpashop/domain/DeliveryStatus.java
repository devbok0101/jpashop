package jpabook.jpashop.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DeliveryStatus {

    READY("배송 준비중"),
    CAMP("보관 중");

    private final String koreanComment;
}
