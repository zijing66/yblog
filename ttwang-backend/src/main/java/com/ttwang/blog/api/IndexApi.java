package com.ttwang.blog.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ttwang.blog.service.BlogService;
import com.ttwang.blog.vo.BlogUserVo;
import com.ttwang.blog.util.BlogConstant;
import com.ttwang.common.util.JwtUtils;
import com.ttwang.common.vo.ApiResponse;
import com.ttwang.common.vo.TokenMsg;

@RestController
@RequestMapping("back")
public class IndexApi {
	
	@Autowired
	private BlogService blogService;

    @PostMapping("login")
    public ApiResponse<BlogUserVo> login(@RequestBody BlogUserVo blogUserVo) {
    	ApiResponse<BlogUserVo> api = new ApiResponse<>();
		try {
			BlogUserVo user = blogService.userLogin(blogUserVo, BlogConstant.USER_TYPE_BACK);
			if (user != null) {
				api.setData(user);
				// 添加token
				String token = JwtUtils.sign(new TokenMsg().setInfo(user));
				api.setToken(token);
			} else {
				api.error("输入的账号不存在或密码错误");
			}
		} catch (Exception e) {
			api.error("用户登录失败");
			e.printStackTrace();
		}
		return api;
    }

}
