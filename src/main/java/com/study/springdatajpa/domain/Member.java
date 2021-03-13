package com.study.springdatajpa.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue
    private long id;

    private String username;


}
