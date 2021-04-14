package com.ttwang.common.util;

import com.ttwang.mybatis.paginator.Page;
import com.ttwang.mybatis.util.Paginator;
import com.ttwang.mybatis.util.ResultPage;

/**
 * @author yanger
 * @description 操作Page的工具类
 * @date 2019/11/19
 */
public class PageUtils<T> {

    public ResultPage<T> convert(Page<T> page){
        Paginator paginator = page.getPaginator();
        // 分页数据
        ResultPage <T> resultPage = new ResultPage <>(paginator.getPage(), paginator.getLimit(), paginator.getTotalCount(), page);
        return resultPage;
    }

}
