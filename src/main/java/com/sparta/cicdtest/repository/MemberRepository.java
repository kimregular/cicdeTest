package com.sparta.cicdtest.repository;

import com.sparta.cicdtest.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}