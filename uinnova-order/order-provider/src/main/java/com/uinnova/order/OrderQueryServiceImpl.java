package com.uinnova.order;

import org.springframework.stereotype.Service;

/**
 * @author xuyangyang
 */
@Service(value = "orderQueryService")
public class OrderQueryServiceImpl implements IOrderQueryService {
    public String doQuery(String param) {
        System.out.println(param);
        return "hello,xuyy";
    }

}
