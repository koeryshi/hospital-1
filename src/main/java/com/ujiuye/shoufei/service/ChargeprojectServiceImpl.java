package com.ujiuye.shoufei.service;

import com.ujiuye.shoufei.bean.Chargeproject;
import com.ujiuye.shoufei.bean.ChargeprojectExample;
import com.ujiuye.shoufei.mapper.ChargeprojectMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ChargeprojectServiceImpl implements ChargeprojectService {

    @Resource
    ChargeprojectMapper chargeprojectMapper;

    @Override
    public boolean chargeprojectAdd(Chargeproject chargeproject) {
        int insert = chargeprojectMapper.insert(chargeproject);
        if (insert>0){
            return true;
        }
        return false;
    }

    @Override
    public List<Chargeproject> chargeprojectShowAll(ChargeprojectExample chargeprojectExample) {
        List<Chargeproject> chargeprojects = chargeprojectMapper.selectByExample(chargeprojectExample);
        return chargeprojects;
    }

    @Override
    public Chargeproject chargeprojectLookone(Integer id) {
        Chargeproject chargeproject = chargeprojectMapper.selectByPrimaryKey(id);

        return chargeproject;
    }

    @Override
    public boolean chargeprojectUpdate(Chargeproject chargeproject) {
        int i = chargeprojectMapper.updateByPrimaryKeySelective(chargeproject);

        if (i>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean chargeprojectDeleteGetone(Integer id) {
        int i = chargeprojectMapper.deleteByPrimaryKey(id);
        if (i>0){
            return true;
        }
        return false;
    }

    @Override
    public List<Chargeproject> chargeprojectQuery(String cmname) {
        List<Chargeproject> chargeprojects = chargeprojectMapper.selectByNameforVague(cmname);
        return chargeprojects;
    }
}
