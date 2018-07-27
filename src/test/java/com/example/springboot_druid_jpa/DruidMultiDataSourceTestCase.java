/*
 * Copyright 1999-2018 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.springboot_druid_jpa;

import com.alibaba.druid.pool.DruidDataSource;


import com.example.springboot_druid_jpa.beans.tcompany.TCompany;
import com.example.springboot_druid_jpa.repository.company.CompanyRepository;
import com.example.springboot_druid_jpa.repository.test.TestRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author lihengming [89921218@qq.com]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("multi-datasource")
public class DruidMultiDataSourceTestCase {

    @Resource
    private DruidDataSource dataSourceOne;
    @Resource
    private DruidDataSource dataSourceTwo;
    @Autowired
    private CompanyRepository tCompanyRepository;
    @Autowired
    private TestRepository testRepository;



    @Test
    public void testDataSourceOne() throws SQLException {
        System.out.println("&&&&&&&&&&&&&"+tCompanyRepository.findById("0d180abd7096e3f6a501d27082b61a60").orElse(new TCompany()).getCompanyName());
        System.out.println("%%%%%%%%%%%%%"+ testRepository.findById("12345").orElse(new com.example.springboot_druid_jpa.beans.test.Ttaxcredit()).getCompanyName());


    }
    @Test
    public void testDataSourceTwo() throws SQLException {

        assertThat(dataSourceTwo.getUrl()).isEqualTo("jdbc:h2:file:./demo-db");
        assertThat(dataSourceTwo.getUsername()).isEqualTo("sa");
        assertThat(dataSourceTwo.getPassword()).isEqualTo("sa");
        assertThat(dataSourceTwo.getDriverClassName()).isEqualTo("org.h2.Driver");

        assertThat(dataSourceTwo.getInitialSize()).isEqualTo(5);

        assertThat(dataSourceTwo.getMaxActive()).isEqualTo(20);
        assertThat(dataSourceTwo.getMaxWait()).isEqualTo(20000);
    }

}
