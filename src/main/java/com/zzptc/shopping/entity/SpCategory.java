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
@TableName("sp_category")
public class SpCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分类唯一ID
     */
    @TableId(value = "cat_id", type = IdType.AUTO)
    private Integer catId;

    /**
     * 分类名称
     */
    private String catName;

    /**
     * 分类父ID
     */
    private Integer catPid;

    /**
     * 分类层级 0: 顶级 1:二级 2:三级
     */
    private Integer catLevel;

    /**
     * 是否删除 1为删除
     */
    private Integer catDeleted;

    private String catIcon;

    private String catSrc;
}
