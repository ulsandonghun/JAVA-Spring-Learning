package com.example.springLearning.domain.squid;


import com.example.springLearning.domain.user.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Squid {

    @Id
    @GeneratedValue
    @Column(name = "Squid_id")

    private Long id;

    private String Level;


    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;


}
