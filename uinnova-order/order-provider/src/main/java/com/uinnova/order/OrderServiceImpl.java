package com.uinnova.order;

/**
 * @author xuyangyang
 */
public class OrderServiceImpl implements IOrderServices {

    public DoOrderResponse doOrder(DoOrderRequest request) {
        System.out.println("曾经来过：" + request.toString());
        DoOrderResponse response = new DoOrderResponse();
        response.setCode("1000");
        response.setMemo("处理成功");
        return response;
    }
}
