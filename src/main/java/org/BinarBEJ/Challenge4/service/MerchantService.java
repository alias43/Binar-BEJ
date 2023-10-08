package org.BinarBEJ.Challenge4.service;

import org.BinarBEJ.Challenge4.model.Merchant;

public interface MerchantService {
    Merchant addMerchant(Merchant merchant);

    Merchant updateMerchantStatus(Long merchantCode, boolean isOpen);
}
