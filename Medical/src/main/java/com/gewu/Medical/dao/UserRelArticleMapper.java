package com.gewu.Medical.dao;

import com.gewu.Medical.model.UserRelArticle;
import com.gewu.Medical.model.UserRelArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRelArticleMapper {
    int countByExample(UserRelArticleExample example);

    int deleteByExample(UserRelArticleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserRelArticle record);

    int insertSelective(UserRelArticle record);

    List<UserRelArticle> selectByExample(UserRelArticleExample example);

    UserRelArticle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserRelArticle record, @Param("example") UserRelArticleExample example);

    int updateByExample(@Param("record") UserRelArticle record, @Param("example") UserRelArticleExample example);

    int updateByPrimaryKeySelective(UserRelArticle record);

    int updateByPrimaryKey(UserRelArticle record);
}