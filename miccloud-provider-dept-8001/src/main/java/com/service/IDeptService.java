package com.service;

import com.entities.Dept;

import java.util.List;

/**
 * @Auther: shuaihu.shen@hand-china.com
 * @Date: 2018/9/27 19:12
 * @Description:
 */
public interface IDeptService {
   public boolean addDept(Dept dept);

   public  Dept getDept(Long id);

   public  List<Dept> findAll();
}
