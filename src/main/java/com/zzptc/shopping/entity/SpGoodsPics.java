package com.zzptc.shopping.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 商品-相册关联表
 * </p>
 *
 * @author cxsxwx
 * @since 2023-02-12
 */
@Getter
@Setter
@TableName("sp_goods_pics")
public class SpGoodsPics implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "pics_id", type = IdType.AUTO)
    private Integer picsId;

    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * 相册大图800*800
     */
    private String picsBig;

    /**
     * 相册中图350*350
     */
    private String picsMid;

    /**
     * 相册小图50*50
     */
    private String picsSma;
}
