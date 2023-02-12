package com.zzptc.shopping.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 商品表
 * </p>
 *
 * @author cxsxwx
 * @since 2023-02-12
 */
@Getter
@Setter
@TableName("sp_goods")
public class SpGoods implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "goods_id", type = IdType.AUTO)
    private Integer goodsId;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品价格
     */
    private BigDecimal goodsPrice;

    /**
     * 商品数量
     */
    private Integer goodsNumber;

    /**
     * 商品重量
     */
    private Short goodsWeight;

    /**
     * 类型id
     */
    private Short catId;

    /**
     * 商品详情介绍
     */
    private String goodsIntroduce;

    /**
     * 图片logo大图
     */
    private String goodsBigLogo;

    /**
     * 图片logo小图
     */
    private String goodsSmallLogo;

    /**
     * 0:正常  1:删除
     */
    private String isDel;

    /**
     * 添加商品时间
     */
    private Integer addTime;

    /**
     * 修改商品时间
     */
    private Integer updTime;

    /**
     * 软删除标志字段
     */
    private Integer deleteTime;

    /**
     * 一级分类id
     */
    private Short catOneId;

    /**
     * 二级分类id
     */
    private Short catTwoId;

    /**
     * 三级分类id
     */
    private Short catThreeId;

    /**
     * 热卖数量
     */
    private Integer hotMumber;

    /**
     * 是否促销
     */
    private Short isPromote;

    /**
     * 商品状态 0: 未通过 1: 审核中 2: 已审核
     */
    private Integer goodsState;
}
