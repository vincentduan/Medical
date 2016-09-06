package com.gewu.Medical.dao;

import com.gewu.Medical.model.DoctorDepartment;
import com.gewu.Medical.model.DoctorDepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DoctorDepartmentMapper {
    int countByExample(DoctorDepartmentExample example);

    int deleteByExample(DoctorDepartmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DoctorDepartment record);

    int insertSelective(DoctorDepartment record);

    List<DoctorDepartment> selectByExample(DoctorDepartmentExample example);

    DoctorDepartment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DoctorDepartment record, @Param("example") DoctorDepartmentExample example);

    int updateByExample(@Param("record") DoctorDepartment record, @Param("example") DoctorDepartmentExample example);

    int updateByPrimaryKeySelective(DoctorDepartment record);

    int updateByPrimaryKey(DoctorDepartment record);
}