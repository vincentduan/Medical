package com.gewu.Medical.dao;

import com.gewu.Medical.model.DoctorHospital;
import com.gewu.Medical.model.DoctorHospitalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DoctorHospitalMapper {
    int countByExample(DoctorHospitalExample example);

    int deleteByExample(DoctorHospitalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DoctorHospital record);

    int insertSelective(DoctorHospital record);

    List<DoctorHospital> selectByExample(DoctorHospitalExample example);

    DoctorHospital selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DoctorHospital record, @Param("example") DoctorHospitalExample example);

    int updateByExample(@Param("record") DoctorHospital record, @Param("example") DoctorHospitalExample example);

    int updateByPrimaryKeySelective(DoctorHospital record);

    int updateByPrimaryKey(DoctorHospital record);
}