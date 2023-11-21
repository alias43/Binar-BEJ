package org.BinarBEJ.Challenge7.service;

import org.BinarBEJ.Challenge7.model.Merchant;

import java.util.List;

public interface MerchantService {
    Merchant addMerchant(Merchant merchant);

    Merchant updateMerchantStatus(Long merchantCode, boolean isOpen);

    List<Merchant> getOpenMerchant();
}
