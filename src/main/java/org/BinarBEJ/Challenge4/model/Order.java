package org.BinarBEJ.Challenge4.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private Date orderTime;

    private String destination;

    private Boolean isCompleted;

    @ManyToOne
    @JoinColumn(name = "userId")
    private Users user;

    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetail;

}
