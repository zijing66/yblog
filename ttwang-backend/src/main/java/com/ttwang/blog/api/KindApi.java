package com.ttwang.blog.api;

import com.ttwang.blog.service.KindService;
import com.ttwang.blog.vo.SummaryVo;
import com.ttwang.common.vo.ApiResponse;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanger
 * @description 统计api
 * @date 2019/11/21
 */
@RestController
@RequestMapping("kind")
public class KindApi {

    @Autowired
    private KindService kindService;

    /**
     * @description 获取统计数据
     * @author yanger
     * @date 2019/11/21
     * @param
     * @return com.yanger.common.vo.ApiResponse<java.util.List<com.yanger.blog.vo.ArticleKindVo>>
     */
    @ApiOperation(value = "获取统计数据", notes = "")
    @RequestMapping("summary")
    public ApiResponse<SummaryVo> getSummary() {
        ApiResponse<SummaryVo> api = new ApiResponse <>();
        try {
            SummaryVo summaryData = kindService.getSummaryData();
            api.setData(summaryData);
        } catch (Exception e) {
            api.error("获取统计数据失败");
            e.printStackTrace();
        }
        return api;
    }

}
