package com.ddy.Medical.dao;

import com.ddy.Medical.model.Serviceseting;
import com.ddy.Medical.model.ServicesetingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServicesetingMapper {
    int countByExample(ServicesetingExample example);

    int deleteByExample(ServicesetingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Serviceseting record);

    int insertSelective(Serviceseting record);

    List<Serviceseting> selectByExample(ServicesetingExample example);

    Serviceseting selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Serviceseting record, @Param("example") ServicesetingExample example);

    int updateByExample(@Param("record") Serviceseting record, @Param("example") ServicesetingExample example);

    int updateByPrimaryKeySelective(Serviceseting record);

    int updateByPrimaryKey(Serviceseting record);
}