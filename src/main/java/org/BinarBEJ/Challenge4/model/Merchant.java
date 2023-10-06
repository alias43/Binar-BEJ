package org.BinarBEJ.Challenge4.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@Builder
@Entity
public class Merchant {

    private String merchantCode;

    private String merchantNamw;

    private String merchantLocation;

    private Boolean isOpen;

}
