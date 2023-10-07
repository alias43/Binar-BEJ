package org.BinarBEJ.Challenge4.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Detail_Pesanan")
public class OrderDetail {

    private String orderId;

    private String productCode;

    private Integer quantity;

    private Integer totalPrice;

}
