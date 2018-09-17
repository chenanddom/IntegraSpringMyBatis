package com.batis.controller;

import com.batis.model.CityResident;
import com.batis.service.CityResidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-09-13
 * Time: 9:34
 */
@RestController
@RequestMapping("/cityResident")
public class CityResidentController {
    @Autowired
    private CityResidentService cityResidentService;
    @RequestMapping("/getCityResident/{id}")
    public CityResident getCityResident(@PathVariable("id")String id) {
        Integer mid = Integer.valueOf(id);
        return cityResidentService.selectCityResident(mid);
    }
}
