package com.hxq.service;

import com.hxq.dao.EmpDAO;
import com.hxq.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpDAO empDAO;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Emp> findAll() {
        return empDAO.findAll();
    }

    @Override
    public void save(Emp emp) {
        empDAO.save(emp);
    }

    @Override
    public void delete(String id) {
        empDAO.delete(id);
    }

    @Override
    public Emp findOne(String id) {
        return empDAO.findOne(id);
    }

    @Override
    public void update(Emp emp) {
        empDAO.update(emp);
    }
}
