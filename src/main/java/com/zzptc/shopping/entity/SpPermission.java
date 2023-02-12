package com.zzptc.shopping.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 权限表
 * </p>
 *
 * @author cxsxwx
 * @since 2023-02-12
 */
@Getter
@Setter
@TableName("sp_permission")
public class SpPermission implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ps_id", type = IdType.AUTO)
    private Short psId;

    /**
     * 权限名称
     */
    private String psName;

    /**
     * 父id
     */
    private Short psPid;

    /**
     * 控制器
     */
    private String psC;

    /**
     * 操作方法
     */
    private String psA;

    /**
     * 权限等级
     */
    private String psLevel;
}
