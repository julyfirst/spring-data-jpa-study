package com.study.springdatajpa.domain;

import lombok.*;

import javax.persistence.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString(of={"id", "username","age"})
public class Member {

    @Id
    @GeneratedValue
    @Column(name="member_id")
    private long id;

    private String username;

    private int age;

    public Member(String username) {
        this.username = username;
    }

    @ManyToOne
    @JoinColumn(name="team_id")
    private Team team;

    public void changeTema(Team team){
        this.team = team;
        team.getMembers().add(this);
    }

}
