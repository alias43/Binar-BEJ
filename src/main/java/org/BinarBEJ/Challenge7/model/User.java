package org.BinarBEJ.Challenge7.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Pengguna")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    private String username;

    private String emailAddress;

    private String password;

    @OneToMany(mappedBy = "user" , fetch = FetchType.LAZY)
    private List<Order> orders;

}
