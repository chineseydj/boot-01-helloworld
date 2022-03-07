package com.cqie.mytest;

import com.cqie.mytest.bean.Address;
import com.cqie.mytest.bean.Admin;
import com.cqie.mytest.mapper.AddressMapper;
import com.cqie.mytest.mapper.AdminMapper;
import com.cqie.mytest.service.AddressService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
class MytestApplicationTests {
@Autowired
    AddressMapper addressMapper;
@Autowired
    AdminMapper adminMapper;
    @Test
    void contextLoads() {
//        int i = addressMapper.deleteById(1);
        //
        List<Admin> admins = adminMapper.queryAdmin();
        admins.forEach(admin -> System.out.println(admin));
    }

}
