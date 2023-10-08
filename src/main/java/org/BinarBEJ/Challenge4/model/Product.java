package org.BinarBEJ.Challenge4.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Produk")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productCode;

    private String productName;

    private double price;

    @ManyToOne
    @JoinColumn(name = "merchantCode")
    private Merchant merchant;
}
