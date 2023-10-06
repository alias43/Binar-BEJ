package org.BinarBEJ.Challenge4.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@Builder
@Entity
public class OrderDetail {

    private String orderId;

    private String productCode;

    private Integer quantity;

    private Integer totalPrice;

}
