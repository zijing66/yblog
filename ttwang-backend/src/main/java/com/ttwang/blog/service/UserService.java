package com.ttwang.blog.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ttwang.blog.dao.BlogUserDao;
import com.ttwang.blog.po.BlogUser;
import com.ttwang.blog.vo.BlogUserVo;
import com.ttwang.blog.vo.PageQueryVo;
import com.ttwang.common.util.ParamUtils;
import com.ttwang.mybatis.paginator.Page;
import com.ttwang.mybatis.paginator.PageParam;
import com.ttwang.mybatis.util.Pages;
import com.ttwang.mybatis.util.ResultPage;

@Service
public class UserService {
	
	@Autowired
	private BlogUserDao blogUserDao;

	public ResultPage<BlogUserVo> getPageData(PageQueryVo pageQueryVo) {
		int pageNo = pageQueryVo.getPageNo();
		int size = pageQueryVo.getPageSize();
		PageParam pageParam = ParamUtils.getDescPageParam(pageNo, size > 0 ? size : 10, "update_time");
		BlogUserVo entry = new BlogUserVo();
		// 搜索条件
		if (StringUtils.isNotBlank(pageQueryVo.getQueryValue())) {
			// 描述的模糊匹配
			
		}
		Page<BlogUser> page = blogUserDao.selectPageByVo(pageParam, entry);
		// 分页数据
		return Pages.convert(pageParam, page, BlogUserVo.class);
	}

	/**
	 * @description 根据id删除用户
	 * @author yanger
	 * @date 2019/11/20
	 * @param userId
	 * @return void
	 */
	public void delByUserId(int userId) {
		blogUserDao.deleteById(userId);
	}

}
