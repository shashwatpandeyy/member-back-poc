package com.twillio.MemberManagement.repository;

import com.twillio.MemberManagement.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {
    List<Bank> findByMemberId(Long memberId);
}
