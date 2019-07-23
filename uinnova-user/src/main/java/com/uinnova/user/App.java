package com.uinnova.user;

import com.uinnova.order.DoOrderRequest;
import com.uinnova.order.DoOrderResponse;
import com.uinnova.order.IOrderServices;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {


    public static void main(String[] args) {

         ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("order-customer.xml");
        IOrderServices services = (IOrderServices) context.getBean("orderServices");

        DoOrderRequest request = new DoOrderRequest();
        request.setName("xuyy");
        DoOrderResponse response = services.doOrder(request);
        System.out.println(response.toString());
    }
}
