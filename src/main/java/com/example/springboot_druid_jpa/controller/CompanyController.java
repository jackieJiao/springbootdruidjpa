package com.example.springboot_druid_jpa.controller;

import com.example.springboot_druid_jpa.beans.tcompany.TCompany;
import com.example.springboot_druid_jpa.repository.company.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


/**
 * 主表
 * 抓取t-company数据
 * 根据公司id遍历各个子表
 * ==
 * Api：用在请求的类上，表示对类的说明
 * tags="说明该类的作用，可以在UI界面上看到的注解"
 * value="该参数没什么意义，在UI界面上也看到，所以不需要配置"
 * <p>
 * desc: https://blog.csdn.net/ysk_xh_521/article/details/80633141
 */

@RestController
@RequestMapping("/company")

public class CompanyController {

    @Autowired
    private CompanyRepository tCompanyRepository;

    @GetMapping(value = "/getByCompanyId")
    @ResponseBody

    public TCompany getCompanyList() {
        long start =System.currentTimeMillis();
        Optional<TCompany> list = tCompanyRepository.findById("0d180abd7096e3f6a501d27082b61a60");
        System.out.println(System.currentTimeMillis()-start);
        return list.orElse(new TCompany());
    }

}
