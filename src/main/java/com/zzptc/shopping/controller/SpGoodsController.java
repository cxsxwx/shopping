package com.zzptc.shopping.controller;

import com.zzptc.shopping.entity.SpGoods;
import com.zzptc.shopping.service.ISpGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 商品表 前端控制器
 * </p>
 *
 * @author cxsxwx
 * @since 2023-02-12
 */
@CrossOrigin
@RestController
@RequestMapping("/sp-goods")
public class SpGoodsController {
    @Autowired
    ISpGoodsService service;

    @GetMapping("/getGoodById/{id}")
    public SpGoods getGoodById(@PathVariable Integer id){
        SpGoods byId = service.getById(id);
        return byId;
    }
}
