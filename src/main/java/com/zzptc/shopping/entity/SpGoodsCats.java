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
 * 
 * </p>
 *
 * @author cxsxwx
 * @since 2023-02-12
 */
@Getter
@Setter
@TableName("sp_goods_cats")
public class SpGoodsCats implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分类id
     */
    @TableId(value = "cat_id", type = IdType.AUTO)
    private Integer catId;

    /**
     * 父级id
     */
    private Integer parentId;

    /**
     * 分类名称
     */
    private String catName;

    /**
     * 是否显示
     */
    private Byte isShow;

    /**
     * 分类排序
     */
    private Integer catSort;

    /**
     * 数据标记
     */
    private Byte dataFlag;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Integer createTime;
}
