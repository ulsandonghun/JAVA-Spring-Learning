package com.example.springLearning.domain.user;

import com.example.springLearning.domain.squid.Squid;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Entity
@Getter
@Setter
public class User {


        @Id @GeneratedValue
        @Column(name = "user_id")
        private Long id;
        private String name;


    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Squid squid;


}
