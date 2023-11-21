package org.BinarBEJ.Challenge7.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Produk")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productCode;

    private String productName;

    private double price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "merchantCode")
    private Merchant merchant;

    @OneToMany(mappedBy = "product" , fetch = FetchType.LAZY)
    private List<OrderDetail> orderDetails;

}
