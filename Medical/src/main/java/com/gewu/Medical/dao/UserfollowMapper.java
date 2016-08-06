package com.gewu.Medical.dao;

import com.gewu.Medical.model.Userfollow;
import com.gewu.Medical.model.UserfollowExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UserfollowMapper {
    int countByExample(UserfollowExample example);

    int deleteByExample(UserfollowExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Userfollow record);

    int insertSelective(Userfollow record);

    List<Userfollow> selectByExample(UserfollowExample example);

    Userfollow selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Userfollow record, @Param("example") UserfollowExample example);

    int updateByExample(@Param("record") Userfollow record, @Param("example") UserfollowExample example);

    int updateByPrimaryKeySelective(Userfollow record);

    int updateByPrimaryKey(Userfollow record);
}