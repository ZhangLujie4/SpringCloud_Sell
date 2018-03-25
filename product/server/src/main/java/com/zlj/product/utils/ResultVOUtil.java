package com.zlj.product.utils;

import com.zlj.product.VO.ResultVO;
import com.zlj.product.enums.ResultStatusEnum;

/**
 * Created by 张璐杰
 * 2018/3/16 19:00
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {

        ResultVO resultVO = new ResultVO();
        resultVO.setCode(ResultStatusEnum.SUCCESS.getCode());
        resultVO.setMsg(ResultStatusEnum.SUCCESS.getMsg());
        resultVO.setData(object);

        return resultVO;
    }
}
