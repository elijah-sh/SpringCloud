package com.service.impl;

import com.dao.DeptDao;
import com.entities.Dept;
import com.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: shuaihu.shen@hand-china.com
 * @Date: 2018/9/27 19:13
 * @Description:
 */
@Service
public class DeptServiceImpl implements IDeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept getDept(Long id) {
        return deptDao.getDept(id);
    }

    @Override
    public List<Dept> findAll() {
        return deptDao.findAll();
    }
}
