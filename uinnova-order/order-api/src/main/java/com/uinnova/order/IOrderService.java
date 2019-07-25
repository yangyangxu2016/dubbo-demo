package com.uinnova.order;

/**
 * @author xuyangyang
 */
public interface IOrderService {

    /**
     * 下单操作
     *
     * @param request
     * @return
     */
    DoOrderResponse doOrder(DoOrderRequest request);



}
