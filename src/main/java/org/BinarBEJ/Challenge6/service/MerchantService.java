package org.BinarBEJ.Challenge6.service;

import org.BinarBEJ.Challenge6.model.Merchant;

import java.util.List;

public interface MerchantService {
    Merchant addMerchant(Merchant merchant);

    Merchant updateMerchantStatus(Long merchantCode, boolean isOpen);

    List<Merchant> getOpenMerchant();
}
