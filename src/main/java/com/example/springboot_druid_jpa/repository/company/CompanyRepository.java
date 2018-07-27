package com.example.springboot_druid_jpa.repository.company;



import com.example.springboot_druid_jpa.beans.tcompany.TCompany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<TCompany, String> {
}
