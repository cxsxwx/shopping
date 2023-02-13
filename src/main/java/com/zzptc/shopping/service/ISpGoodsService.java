package com.zzptc.shopping.service;

import com.zzptc.shopping.entity.SpGoods;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 商品表 服务类
 * </p>
 *
 * @author cxsxwx
 * @since 2023-02-12
 */
public interface ISpGoodsService extends IService<SpGoods> {
    Map<String, Object> getAll(Integer pageIndex, Integer pageSize);
}
