package com.ttwang.blog.dao;

import org.apache.ibatis.annotations.Mapper;

import com.ttwang.blog.po.Article;
import com.ttwang.blog.vo.ArticleVo;
import com.ttwang.generator.dao.MybatisBaseDao;
import com.ttwang.mybatis.paginator.Page;
import com.ttwang.mybatis.paginator.PageParam;
import org.apache.ibatis.annotations.Param;

/**
 * 表article对应Dao接口
 */
@Mapper
public interface ArticleDao extends MybatisBaseDao<Article, Integer> {
	
	/**
	 * @description 根据vo进行查询
	 * @author YangHao  
	 * @time 2018年12月19日-下午11:30:19
	 * @param pageParam
	 * @param entity
	 * @return
	 */
	Page<Article> selectPageByVo(PageParam pageParam, ArticleVo entity);

	/**
	 * @description  更新文章状态
	 * @author yanger
	 * @date 2019/11/21
	 * @param id
	 * @param state
	 * @return void
	 */
    void updateState(@Param("id") int id, @Param("state") String state);

	/**
	 * 获取热门文章
	 * @param pageParam
	 * @param entity
     * @return
     */
	Page<Article> getHotArts(PageParam pageParam, Article entity);

	/**
	 * 更新留言数量
	 * @param articleId
     */
	void updateCommons(@Param("id") Integer articleId);

	void updateLikes(@Param("id") Integer articleId);

	void updateViews(@Param("id") Integer articleId);

	int getLikes(@Param("id") Integer articleId);
}