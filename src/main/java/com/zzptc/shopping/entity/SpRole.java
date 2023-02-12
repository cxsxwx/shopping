package com.zzptc.shopping.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author cxsxwx
 * @since 2023-02-12
 */
@Getter
@Setter
@TableName("sp_role")
public class SpRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "role_id", type = IdType.AUTO)
    private Short roleId;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 权限ids,1,2,5
     */
    private String psIds;

    /**
     * 控制器-操作,控制器-操作,控制器-操作
     */
    private String psCa;

    private String roleDesc;
}
