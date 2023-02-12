package com.zzptc.shopping.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 管理员表
 * </p>
 *
 * @author cxsxwx
 * @since 2023-02-12
 */
@Getter
@Setter
@TableName("sp_manager")
public class SpManager implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "mg_id", type = IdType.AUTO)
    private Integer mgId;

    /**
     * 名称
     */
    private String mgName;

    /**
     * 密码
     */
    private String mgPwd;

    /**
     * 注册时间
     */
    private Integer mgTime;

    /**
     * 角色id
     */
    private Byte roleId;

    private String mgMobile;

    private String mgEmail;

    /**
     * 1：表示启用 0:表示禁用
     */
    private Byte mgState;
}
