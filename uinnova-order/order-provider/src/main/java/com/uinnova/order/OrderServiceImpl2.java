package com.uinnova.order;

/**
 * @author xuyangyang
 */
public class OrderServiceImpl2 implements IOrderService {

    public DoOrderResponse doOrder(DoOrderRequest request) {
        System.out.println("曾经来过v2：" + request.toString());
        DoOrderResponse response = new DoOrderResponse();
        response.setCode("2000");
        response.setMemo("处理成功2");
        return response;
    }
}
