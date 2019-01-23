package com.ujiuye.shoufei.controller;

import com.ujiuye.shoufei.bean.Chargeproject;
import com.ujiuye.shoufei.bean.ChargeprojectExample;
import com.ujiuye.shoufei.service.ChargeprojectService;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("Chargeproject")
public class ChargeprojectController {

    @Resource
    ChargeprojectService chargeprojectService;

    //添加一个收费项目
    @RequestMapping("chargeprojectAdd")
    public String chargeprojectAdd(Chargeproject chargeproject){
        chargeproject.setCmdate(new Date());
        boolean b = chargeprojectService.chargeprojectAdd(chargeproject);
        if (b){
            return "redirect:/html/hospital/charge.jsp";
        }
        return "error";
    }


    //查询所有收费项目
    @RequestMapping("chargeprojectShowAll")
    @ResponseBody
    public List<Chargeproject> chargeprojectShowAll(){
        List<Chargeproject> chargeprojects = chargeprojectService.chargeprojectShowAll(null);
        return chargeprojects;
    }

    //查看详情查询一条数据
    @RequestMapping("chargeprojectLookone")
    public String chargeprojectLookone(int id, HttpSession session){
        System.out.println(id);
        Chargeproject chargeproject = chargeprojectService.chargeprojectLookone(id);
        session.setAttribute("chargeproject",chargeproject);
        return "redirect:/html/hospital/charge-lookOne.jsp";
    }

    //修改——查询一条数据
    @RequestMapping("chargeprojectUpdateGetone")
    public String chargeprojectUpdateGetone(int id, HttpSession session){

        Chargeproject chargeproject = chargeprojectService.chargeprojectLookone(id);
        session.setAttribute("chargeproject",chargeproject);
        return "redirect:/html/hospital/charge-edit.jsp";
    }

    //更新数据
    @RequestMapping("chargeprojectUpdate")
    public String chargeprojectUpdate(Chargeproject chargeproject){

        boolean b = chargeprojectService.chargeprojectUpdate(chargeproject);
        if (b){
            return "redirect:/html/hospital/charge.jsp";
        }else {
            return "error";
        }
    }


    //删除一条
    @RequestMapping("chargeprojectDeleteGetone")
    public String chargeprojectDeleteGetone(int id){
        boolean b = chargeprojectService.chargeprojectDeleteGetone(id);
        if (b){
            return "redirect:/html/hospital/charge.jsp";
        }
        return "error";
    }


    //通过cmname模糊查询
    @RequestMapping("chargeprojectQuery")
    @ResponseBody
    public List<Chargeproject> chargeprojectQuery(String cmName){
        System.out.println(cmName);
        List<Chargeproject> chargeprojects = chargeprojectService.chargeprojectQuery(cmName);

        for (Chargeproject c : chargeprojects){
            System.out.println(c);
        }
        return chargeprojects;
    }
}
