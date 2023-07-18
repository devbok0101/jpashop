package jpabook.jpashop.domain.item;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import lombok.Getter;

@Entity
@Getter
@DiscriminatorColumn(name = "B")
public class Book extends Item{
    private String author;
    private String isbn;
}
