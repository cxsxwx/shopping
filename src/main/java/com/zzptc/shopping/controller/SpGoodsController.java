package com.zzptc.shopping.controller;

import com.zzptc.shopping.common.AjaxResult;
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

    /**
     * 通过id获取商品信息
     *
     * @param id 商品id
     * @return 返回商品信息
     */
    @GetMapping("/getGoodById/{id}")
    public AjaxResult getGoodById(@PathVariable Integer id) {
        return AjaxResult.success(service.getById(id));
    }

    /**
     * 修改商品信息
     *
     * @param goods 商品类
     * @return 返回是否成功
     */
    @PutMapping("/updateGood")
    public AjaxResult updateGood(@RequestBody SpGoods goods) {
        return AjaxResult.success(service.updateById(goods));
    }

    /**
     * 通过id删除商品信息
     *
     * @param id 商品id
     * @return 返回是否成功
     */
    @DeleteMapping("/deleteGoodById/{id}")
    public AjaxResult deleteGoodById(@PathVariable Integer id) {
        return AjaxResult.success(service.removeById(id));
    }

    /**
     * 添加商品信息
     *
     * @param goods 商品类
     * @return 返回是否成功
     */
    @PostMapping("/insertGood")
    public AjaxResult insertGood(@RequestBody SpGoods goods) {
        return AjaxResult.success(service.save(goods));
    }

    /**
     * 获取所有商品信息
     *
     * @return 返回商品信息
     */
    @GetMapping("/getAllGoods")
    public AjaxResult getAllGoods() {
        return AjaxResult.success(service.list());
    }

    /**
     * 分页获取商品数据
     *
     * @param pageIndex 起始页
     * @param pageSize  每页数据条数
     * @return 返回分页商品数据
     */
    @GetMapping("/getAllGoodsByPage/{pageIndex}/{pageSize}")
    public AjaxResult getAllGoodsByPage(@PathVariable Integer pageIndex, @PathVariable Integer pageSize) {
        return AjaxResult.success(service.getAll(pageIndex, pageSize));
    }


}
