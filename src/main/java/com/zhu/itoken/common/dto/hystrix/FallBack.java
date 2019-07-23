package com.zhu.itoken.common.dto.hystrix;

import com.google.common.collect.Lists;
import com.zhu.itoken.common.dto.BaseResoult;
import com.zhu.itoken.common.dto.com.zhu.itoken.common.HttpStatus;

public class FallBack {
    public static String badGatAway(){
        BaseResoult baseResoult = BaseResoult.notok(Lists.newArrayList(new BaseResoult.Error(
                String.valueOf(HttpStatus.BAD_STATUS.getCode()),HttpStatus.BAD_STATUS.getMessage()
        )));
        return baseResoult.toString();
    }

}
