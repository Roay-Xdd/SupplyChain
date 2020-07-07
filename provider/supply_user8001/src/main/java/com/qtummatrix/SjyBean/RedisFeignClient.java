package com.qtummatrix.SjyBean;


import org.springframework.stereotype.Component;

/**
 * 功能描述：redis服务
 *
 * @Author: Shi JiuYue
 * @Date: 2020/7/7 16:57
 */

@Component
public class RedisFeignClient {


    /**
     * 方法描述: 获取token
     * @Author: Shi JiuYue
     * @Date 17:07 2020/7/7
     **/
    public SupplyResult getFromRedis(String token){

        return SupplyResult.build(400,"getFromRedis请求熔断了……");
    }


    /**
     * 方法描述: 将token和value 写入redis中，并且设置时间
     * @Author: Shi JiuYue
     * @Date 17:08 2020/7/7
     **/
    public SupplyResult setToRedis(String token,Object value ,Long time){

        return SupplyResult.build(400,"getFromRedis请求熔断了……");
    }

}
