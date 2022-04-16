package com.gmc.dockertest.repository;

import com.gmc.dockertest.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
