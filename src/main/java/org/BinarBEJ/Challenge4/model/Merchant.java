package org.BinarBEJ.Challenge4.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Penjual")
public class Merchant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long merchantCode;

    private String merchantName;

    private String merchantLocation;

    private Boolean isOpen;

    @OneToMany(mappedBy = "merchant")
    private List<Product> products;

}
