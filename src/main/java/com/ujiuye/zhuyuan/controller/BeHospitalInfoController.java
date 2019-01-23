package com.ujiuye.zhuyuan.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ujiuye.zhuyuan.bean.Behospitalinfo;
import com.ujiuye.zhuyuan.bean.BehospitalinfoExample;
import com.ujiuye.zhuyuan.service.BeHospitalInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/zhuyuan")
public class BeHospitalInfoController {
    @Resource
    private BeHospitalInfoService beHospitalInfoService;

    @RequestMapping("selectInfo")
    @ResponseBody
    public List<Behospitalinfo> selectInfo(Behospitalinfo behospitalinfo){

        System.out.println(behospitalinfo);
        System.out.println(behospitalinfo.getDate1()+"----"+behospitalinfo.getDate2());
        BehospitalinfoExample be=new BehospitalinfoExample();
        be.createCriteria();

        List<Behospitalinfo> behospitalinfos = beHospitalInfoService.selectBeHospitalInfo(be);
        System.out.println(behospitalinfos.size());
        return behospitalinfos;
    }




}



