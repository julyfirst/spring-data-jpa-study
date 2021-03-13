package com.study.springdatajpa.repository;

import com.study.springdatajpa.domain.Member;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberJpaRepository {


    // jpa를 사용하려면 entity 매니저가 있어야함
    @PersistenceContext // 이거를 사용하려면 영속성 컨텍스트 엔티티를 불러옴
    private EntityManager em;


    public Member save(Member member){
        em.persist(member);
        return member;
    }

    // find를 하게되면 query를 날리게됨
    public Member find(Long id){
        return em.find(Member.class, id);
    }


}
