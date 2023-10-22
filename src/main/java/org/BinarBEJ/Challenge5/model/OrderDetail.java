package org.BinarBEJ.Challenge5.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Detail_Pesanan")
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderDetailId;

    private Integer quantity;

    private Integer totalPrice;

    @ManyToOne
    @JoinColumn(name = "orderId")
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productCode")
    private Product product;


}
