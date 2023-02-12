package com.zzptc.shopping.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 快递表
 * </p>
 *
 * @author cxsxwx
 * @since 2023-02-12
 */
@Getter
@Setter
@TableName("sp_express")
public class SpExpress implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "express_id", type = IdType.AUTO)
    private Integer expressId;

    /**
     * 订单id
     */
    private Integer orderId;

    /**
     * 订单快递公司名称
     */
    private String expressCom;

    /**
     * 快递单编号
     */
    private String expressNu;

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
