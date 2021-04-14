package com.ttwang.blog.dao;

import org.apache.ibatis.annotations.Mapper;

import com.ttwang.blog.po.Contact;
import com.ttwang.generator.dao.MybatisBaseDao;

/**
 * 表Contact对应Dao接口<br/>
 */
@Mapper
public interface ContactDao extends MybatisBaseDao<Contact, Integer> {

}