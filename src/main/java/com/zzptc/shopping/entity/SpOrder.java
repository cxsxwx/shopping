package com.zzptc.shopping.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author cxsxwx
 * @since 2023-02-12
 */
@Getter
@Setter
@TableName("sp_order")
public class SpOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "order_id", type = IdType.AUTO)
    private Integer orderId;

    /**
     * 下订单会员id
     */
    private Integer userId;

    /**
     * 订单编号
     */
    private String orderNumber;

    /**
     * 订单总金额
     */
    private BigDecimal orderPrice;

    /**
     * 支付方式  0未支付 1支付宝  2微信  3银行卡
     */
    private String orderPay;

    /**
     * 订单是否已经发货
     */
    private String isSend;

    /**
     * 支付宝交易流水号码
     */
    private String tradeNo;

    /**
     * 发票抬头 个人 公司
     */
    private String orderFapiaoTitle;

    /**
     * 公司名称
     */
    private String orderFapiaoCompany;

    /**
     * 发票内容
     */
    private String orderFapiaoContent;

    /**
     * consignee收货人地址
     */
    private String consigneeAddr;

    /**
     * 订单状态： 0未付款、1已付款
     */
    private String payStatus;

    /**
     * 记录生成时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Integer createTime;

    /**
     * 记录修改时间
     */
    private Integer updateTime;
}
