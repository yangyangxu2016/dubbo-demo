package com.uinnova.order;

import org.springframework.stereotype.Service;

/**
 * @author xuyangyang
 */
@Service(value = "orderService")
public class OrderServiceImpl implements IOrderService {

    public DoOrderResponse doOrder(DoOrderRequest request) {
        System.out.println("曾经来过：" + request.toString());
        DoOrderResponse response = new DoOrderResponse();
        response.setCode("1000");
        response.setMemo("处理成功");
        return response;
    }
}
