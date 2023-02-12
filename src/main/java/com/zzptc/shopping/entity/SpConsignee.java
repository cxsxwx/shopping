package com.zzptc.shopping.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 收货人表
 * </p>
 *
 * @author cxsxwx
 * @since 2023-02-12
 */
@Getter
@Setter
@TableName("sp_consignee")
public class SpConsignee implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "cgn_id", type = IdType.AUTO)
    private Integer cgnId;

    /**
     * 会员id
     */
    private Integer userId;

    /**
     * 收货人名称
     */
    private String cgnName;

    /**
     * 收货人地址
     */
    private String cgnAddress;

    /**
     * 收货人电话
     */
    private String cgnTel;

    /**
     * 邮编
     */
    private String cgnCode;

    /**
     * 删除时间
     */
    private Integer deleteTime;
}
