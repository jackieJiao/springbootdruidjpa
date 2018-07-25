package com.example.springboot_druid_jpa.repository;


import com.example.springboot_druid_jpa.beans.TCompany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<TCompany, String> {
}
