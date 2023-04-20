package org.koreait.repositories;

import org.koreait.entities.Member;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface MemberRepository extends JpaRepository<Member,Long> {
    Member findByUserId(String userId);

    List<Member> findByUserIdNot(String userId); // userId <> ...
    List<Member> findByUserNmContaining(String key); // userNm LIKE '%:key%'

    List<Member> findByRegDtBetween(LocalDate sDate, LocalDate eDate, Pageable pageable);

    List<Member> findByRegDtBetweenOrderByRegDtDesc(LocalDate sDate, LocalDate eDate);


    @Query("SELECT m FROM Member m WHERE m.userNm LIKE %:key% ORDER BY m.regDt DESC")
    List<Member> findByUsers(@Param("key") String keyword);



}
