package com.qtummatrix.service;

import com.qtummatrix.bean.LSP_Logistics;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 功能描述：
 *
 * @Author: Shi JiuYue
 * @Date: 2020/7/16 19:16
 */
@Component
public class LSP_ServerApplication implements LSP_Server {

    @Override
    public List<LSP_Logistics> selectLog(Integer orderstep) {
        System.out.println("李世鹏连接超时");
        return null;
    }

    @Override
    public Object updateLog(String orderid, Integer orderstep) {
        System.out.println("李世鹏连接超时");
        return null;
    }
}
