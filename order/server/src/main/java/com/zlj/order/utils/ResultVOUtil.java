package com.zlj.order.utils;

import com.zlj.order.VO.ResultVO;

/**
 * Created by 张璐杰
 * 2018/3/17 14:09
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);

        return resultVO;
    }
}
