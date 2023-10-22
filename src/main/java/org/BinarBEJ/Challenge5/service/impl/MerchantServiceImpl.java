package org.BinarBEJ.Challenge5.service.impl;

import org.BinarBEJ.Challenge5.model.Merchant;
import org.BinarBEJ.Challenge5.repository.MerchantRepository;
import org.BinarBEJ.Challenge5.service.MerchantService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MerchantServiceImpl implements MerchantService {

    @Autowired
    private MerchantRepository merchantRepository;
    @Override
    public Merchant addMerchant(Merchant merchant) {
        return merchantRepository.save(merchant);
    }

    @Override
    public Merchant updateMerchantStatus(Long merchantCode, boolean isOpen) {
        Merchant merchant = (merchantRepository.findById(merchantCode)).orElse(null);
        if (merchant != null) {
            merchant.setIsOpen(isOpen);
            return merchantRepository.save(merchant);
        }
        return null;
    }

    @Override
    public List<Merchant> getOpenMerchant() {
        return null;
    }
}
