package com.dao;

import com.entities.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: shuaihu.shen@hand-china.com
 * @Date: 2018/9/26 16:28
 * @Description:
 */
@Mapper
@Repository
public interface DeptDao {
    boolean addDept(Dept dept);

    Dept getDept(Long id);

    List<Dept> findAll();

}
