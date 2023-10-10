package org.BinarBEJ.Challenge4.repository;

import org.BinarBEJ.Challenge4.model.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.Id;
import java.util.List;

@Repository
public interface MerchantRepository extends JpaRepository<Merchant, Long> {

    Merchant findById(Id merchantCode);

    List<Merchant> findAll();

    void deleteById(Long merchantCode);

    @Query("SELECT m FROM Merchant m WHERE m.isOpen = true")
    List<Merchant> findOpenMerchants();
}
