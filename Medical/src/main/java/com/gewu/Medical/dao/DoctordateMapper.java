package com.gewu.Medical.dao;

import com.gewu.Medical.model.Doctordate;
import com.gewu.Medical.model.DoctordateExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DoctordateMapper {
    int countByExample(DoctordateExample example);

    int deleteByExample(DoctordateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Doctordate record);

    int insertSelective(Doctordate record);

    List<Doctordate> selectByExample(DoctordateExample example);

    Doctordate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Doctordate record, @Param("example") DoctordateExample example);

    int updateByExample(@Param("record") Doctordate record, @Param("example") DoctordateExample example);

    int updateByPrimaryKeySelective(Doctordate record);

    int updateByPrimaryKey(Doctordate record);
}