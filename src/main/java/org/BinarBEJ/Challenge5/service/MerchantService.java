package org.BinarBEJ.Challenge5.service;

import org.BinarBEJ.Challenge5.model.Merchant;

import java.util.List;

public interface MerchantService {
    Merchant addMerchant(Merchant merchant);

    Merchant updateMerchantStatus(Long merchantCode, boolean isOpen);

    List<Merchant> getOpenMerchant();
}
