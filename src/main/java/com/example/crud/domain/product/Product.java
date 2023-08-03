package com.example.crud.domain.product;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "product")
@Entity(name = "product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private Integer price;

    public Product(RequestProduct data) {
        this.name = data.name();
        this.price = data.price();
    }
}
