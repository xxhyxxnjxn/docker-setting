package com.gmc.dockertest.entity;


import lombok.*;
import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "auth_user")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "member_id")
    private Long memberId;

    @Column(name = "name")
    private String name;
}
