package com.cqie.mytest.mapper;

import com.cqie.mytest.bean.Address;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;

import java.util.List;

/**
 * @Entity com.cqie.mytest.bean.Address
 */
@Mapper
public interface AddressMapper extends BaseMapper<Address> {
//    List<>
}




