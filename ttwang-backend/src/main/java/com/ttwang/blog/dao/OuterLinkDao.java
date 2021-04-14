package com.ttwang.blog.dao;

import org.apache.ibatis.annotations.Mapper;

import com.ttwang.blog.po.OuterLink;
import com.ttwang.generator.dao.MybatisBaseDao;

/**
 * 表outer_link对应Dao接口<br/>
 */
@Mapper
public interface OuterLinkDao extends MybatisBaseDao<OuterLink, Integer> {

}