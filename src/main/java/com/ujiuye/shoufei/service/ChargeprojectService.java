package com.ujiuye.shoufei.service;

import com.ujiuye.shoufei.bean.Chargeproject;
import com.ujiuye.shoufei.bean.ChargeprojectExample;

import java.util.List;

public interface ChargeprojectService {

    boolean chargeprojectAdd(Chargeproject chargeproject);

    List<Chargeproject> chargeprojectShowAll(ChargeprojectExample chargeprojectExample);

    Chargeproject chargeprojectLookone(Integer id);

    boolean chargeprojectUpdate(Chargeproject chargeproject);

    boolean chargeprojectDeleteGetone(Integer id);

    List<Chargeproject> chargeprojectQuery(String cmname);
}
