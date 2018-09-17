package com.batis.service;

import com.batis.mapper.CityResidentMapper;
import com.batis.model.CityResident;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-09-13
 * Time: 9:38
 */
@Service
public class CityResidentService {
    private final Logger logger = org.slf4j.LoggerFactory.getLogger(CityResidentService.class);

    @Autowired
    CityResidentMapper cityResidentMapper;



    public CityResident selectCityResident(Integer id){
        logger.info("this test message{}"+String.valueOf(id));
    return cityResidentMapper.selectCityResident(id);
    }

}
