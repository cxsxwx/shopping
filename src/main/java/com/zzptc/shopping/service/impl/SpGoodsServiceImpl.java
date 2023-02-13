package com.zzptc.shopping.service.impl;

import com.zzptc.shopping.entity.SpGoods;
import com.zzptc.shopping.mapper.SpGoodsMapper;
import com.zzptc.shopping.service.ISpGoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 商品表 服务实现类
 * </p>
 *
 * @author cxsxwx
 * @since 2023-02-12
 */
@Service
public class SpGoodsServiceImpl extends ServiceImpl<SpGoodsMapper, SpGoods> implements ISpGoodsService {


    @Override
    public Map<String, Object> getAll(Integer pageIndex, Integer pageSize) {
        pageIndex = pageIndex - 1;
        pageIndex = pageIndex >= 1 ? pageIndex * pageSize : pageIndex;
        Integer total = baseMapper.selectList(null).size();
        HashMap goods = new HashMap();
        goods.put("total", total);
        goods.put("record", total % pageSize != 0 ? total / pageSize + 1 : total / pageSize);
        goods.put("data", this.baseMapper.getAll(pageIndex, pageSize));
        return null;
    }
}
