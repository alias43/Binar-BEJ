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
@Table(name = "Penjual")
public class Merchant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long merchantCode;

    private String merchantName;

    private String merchantLocation;

    private Boolean isOpen;

    @OneToMany(mappedBy = "merchant" , fetch = FetchType.LAZY)
    private List<Product> products;

}
