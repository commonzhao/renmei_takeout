package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.entity.Category;

/***
 *
 * @author COMMON-PC-1
 */
public interface CategoryService extends IService<Category> {

    /***
     * 删除
     * @param id id
     */
    void remove(Long id);

}
