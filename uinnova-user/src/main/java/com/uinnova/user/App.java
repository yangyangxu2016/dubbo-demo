package com.uinnova.user;

import com.uinnova.order.DoOrderRequest;
import com.uinnova.order.DoOrderResponse;
import com.uinnova.order.IOrderQueryService;
import com.uinnova.order.IOrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {


    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("order-customer.xml");
        IOrderService services = (IOrderService) context.getBean("orderService");

        DoOrderRequest request = new DoOrderRequest();
        request.setName("xuyy");
        DoOrderResponse response = services.doOrder(request);
        System.out.println(response.toString());

        IOrderService services1 = (IOrderService) context.getBean("orderService2");

        DoOrderRequest request1 = new DoOrderRequest();
        request.setName("xuyy2");
        DoOrderResponse response1 = services1.doOrder(request);
        System.out.println(response1.toString());



        IOrderQueryService orderQueryService = (IOrderQueryService) context.getBean("orderQueryService");
        String ddd = orderQueryService.doQuery("ddd");
        System.out.println(ddd);


//        System.in.read();
    }
}
