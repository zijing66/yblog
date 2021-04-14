package com.ttwang.blog.dao;

import org.apache.ibatis.annotations.Mapper;

import com.ttwang.blog.po.OperateLog;
import com.ttwang.generator.dao.MybatisBaseDao;

/**
 * 表operate_log对应Dao接口<br/>
 */
@Mapper
public interface OperateLogDao extends MybatisBaseDao<OperateLog, Integer> {

}