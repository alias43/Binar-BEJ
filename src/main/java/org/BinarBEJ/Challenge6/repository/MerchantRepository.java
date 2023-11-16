package org.BinarBEJ.Challenge6.repository;

import org.BinarBEJ.Challenge6.model.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchantRepository extends JpaRepository<Merchant, Long> {

}
