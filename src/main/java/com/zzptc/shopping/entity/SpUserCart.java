package com.zzptc.shopping.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
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
@TableName("sp_user_cart")
public class SpUserCart implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "cart_id", type = IdType.AUTO)
    private Integer cartId;

    /**
     * 学员id
     */
    private Integer userId;

    /**
     * 购物车详情信息，二维数组序列化信息
     */
    private String cartInfo;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private LocalDateTime deleteTime;
}
