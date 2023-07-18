package jpabook.jpashop.domain;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jpabook.jpashop.domain.item.Item;
import lombok.Getter;

@Entity
@Getter
@DiscriminatorColumn(name = "M")
public class Movie extends Item {
    private String director;
    private String actor;
}
