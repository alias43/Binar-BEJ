package org.BinarBEJ.Challenge4.repository;

import org.BinarBEJ.Challenge4.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    // Membaca pesanan berdasarkan ID
    Order findById(Long orderId);

    // Mengambil semua pesanan
    List<Order> findAll();

    // Menyimpan atau mengupdate pesanan
    Order save(Order order);

    // Menghapus pesanan berdasarkan ID
    void deleteById(Long orderId);

    @Query("SELECT o FROM Order o WHERE o.user.userId = ?1")
    List<Order> findByUserId(Long userId);
}
