package com.ujiuye.zhuyuan.service;

import com.ujiuye.zhuyuan.bean.Behospitalinfo;
import com.ujiuye.zhuyuan.bean.BehospitalinfoExample;
import com.ujiuye.zhuyuan.mapper.BehospitalinfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BeHospitalInfoServiceImpl implements BeHospitalInfoService {

    @Resource
    private BehospitalinfoMapper behospitalinfoMapper;

    //根据条件查询
    @Override
    public List<Behospitalinfo> selectBeHospitalInfo(BehospitalinfoExample behospitalinfoExample) {
        List<Behospitalinfo> behospitalinfos = behospitalinfoMapper.selectBehospitalinfo(behospitalinfoExample);
        return behospitalinfos;
    }
}
