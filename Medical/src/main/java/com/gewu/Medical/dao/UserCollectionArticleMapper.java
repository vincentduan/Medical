package com.gewu.Medical.dao;

import com.gewu.Medical.model.UserCollectionArticle;
import com.gewu.Medical.model.UserCollectionArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserCollectionArticleMapper {
    int countByExample(UserCollectionArticleExample example);

    int deleteByExample(UserCollectionArticleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserCollectionArticle record);

    int insertSelective(UserCollectionArticle record);

    List<UserCollectionArticle> selectByExample(UserCollectionArticleExample example);

    UserCollectionArticle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserCollectionArticle record, @Param("example") UserCollectionArticleExample example);

    int updateByExample(@Param("record") UserCollectionArticle record, @Param("example") UserCollectionArticleExample example);

    int updateByPrimaryKeySelective(UserCollectionArticle record);

    int updateByPrimaryKey(UserCollectionArticle record);
}