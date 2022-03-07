package com.cqie.mytest.mapper;

import com.cqie.mytest.bean.Admin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Entity com.cqie.mytest.bean.Admin
 */
@Mapper
public interface AdminMapper extends BaseMapper<Admin> {
    @Select("select * from admin")
    List<Admin> queryAdmin();
}




