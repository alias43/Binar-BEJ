package org.BinarBEJ.Challenge4.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Pengguna")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String username;

    private String emailAddress;

    private String password;

    @OneToMany(mappedBy = "user")
    private List<Order> orders;

}
