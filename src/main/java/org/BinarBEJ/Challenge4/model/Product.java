package org.BinarBEJ.Challenge4.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@Builder
@Entity
public class Product {

    private String productCode;

    private String productName;

    private Integer price;

    private String merchantCode;
}
