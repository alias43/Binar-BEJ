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
@Table(name = "Penjual")
public class Merchant {

    private String merchantCode;

    private String merchantName;

    private String merchantLocation;

    private Boolean isOpen;

}
