package com.ttwang.blog.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.ttwang.mybatis.util.ResultPage;

import lombok.Data;

@Data
public class StudyDataVo implements Serializable {
	
	private static final long serialVersionUID = 1L;

	//学习笔记及其分页信息
	private ResultPage<ArticleVo> studyPage;
	
	//热门文章
	private List<ArticleVo> hots = new ArrayList<>(0);
	
	//文章分类
	private List<ArticleKindVo> kinds;
	
	//项目服务路径
	private String serverPath;
	
}
