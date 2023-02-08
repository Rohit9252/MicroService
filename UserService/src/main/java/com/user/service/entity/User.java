package com.user.service.entity;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "micro_user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class User {

    @Id
    @Column(name = "Id")
    private  String userID;

    @Column(name = "Name")
    private  String name;

    @Column(name = "Email")
    private String email;

    @Column(name = "About")
    private String about;


}
