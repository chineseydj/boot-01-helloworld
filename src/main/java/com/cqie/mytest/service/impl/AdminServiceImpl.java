package com.cqie.mytest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cqie.mytest.bean.Admin;
import com.cqie.mytest.service.AdminService;
import com.cqie.mytest.mapper.AdminMapper;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin>
    implements AdminService{

}




