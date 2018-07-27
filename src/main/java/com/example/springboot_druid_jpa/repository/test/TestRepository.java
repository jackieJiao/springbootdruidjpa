package com.example.springboot_druid_jpa.repository.test;


import com.example.springboot_druid_jpa.beans.test.Ttaxcredit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Ttaxcredit, String> {
}
