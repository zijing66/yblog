package com.ttwang.blog.dao;

import org.apache.ibatis.annotations.Mapper;

import com.ttwang.blog.po.UploadFile;
import com.ttwang.generator.dao.MybatisBaseDao;

/**
 * 表upload_file对应Dao接口<br/>
 */
@Mapper
public interface UploadFileDao extends MybatisBaseDao<UploadFile, Integer> {

}