package com.batis.mapper;


import com.batis.model.CityResident;
import com.batis.model.CityResidentIdentificationCard;
import com.batis.model.CityResidentIdentificationCardHobby;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-08-21
 * Time: 13:40
 */
@Mapper
public interface CityResidentMapper {
    CityResident selectCityResident(Integer id);
}
