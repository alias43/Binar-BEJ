package org.BinarBEJ.Challenge6.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Pesanan")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;

    private Date orderTime;

    private String destination;

    private Boolean isCompleted;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;

    @OneToMany(mappedBy = "order" , fetch = FetchType.LAZY)
    private List<OrderDetail> orderDetail;

}
