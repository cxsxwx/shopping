package com.zzptc.shopping.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 属性表
 * </p>
 *
 * @author cxsxwx
 * @since 2023-02-12
 */
@Getter
@Setter
@TableName("sp_attribute")
public class SpAttribute implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "attr_id", type = IdType.AUTO)
    private Short attrId;

    /**
     * 属性名称
     */
    private String attrName;

    /**
     * 外键，类型id
     */
    private Short catId;

    /**
     * only:输入框(唯一)  many:后台下拉列表/前台单选框
     */
    private String attrSel;

    /**
     * manual:手工录入  list:从列表选择
     */
    private String attrWrite;

    /**
     * 可选值列表信息,例如颜色：白色,红色,绿色,多个可选值通过逗号分隔
     */
    private String attrVals;

    /**
     * 删除时间标志
     */
    private Integer deleteTime;
}
