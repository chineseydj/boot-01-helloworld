package com.cqie.mytest.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName smbms_bill
 */
@TableName(value ="smbms_bill")
@Data
public class SmbmsBill implements Serializable {
    /**
     * 主键ID
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 账单编码
     */
    private String billcode;

    /**
     * 商品名称
     */
    private String productname;

    /**
     * 商品描述
     */
    private String productdesc;

    /**
     * 商品单位
     */
    private String productunit;

    /**
     * 商品数量
     */
    private BigDecimal productcount;

    /**
     * 商品总额
     */
    private BigDecimal totalprice;

    /**
     * 是否支付（1：未支付 2：已支付）
     */
    private Integer ispayment;

    /**
     * 创建者（userId）
     */
    private Long createdby;

    /**
     * 创建时间
     */
    private Date creationdate;

    /**
     * 更新者（userId）
     */
    private Long modifyby;

    /**
     * 更新时间
     */
    private Date modifydate;

    /**
     * 供应商ID
     */
    private Integer providerid;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}