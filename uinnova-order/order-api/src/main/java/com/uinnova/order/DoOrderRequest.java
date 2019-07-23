package com.uinnova.order;

import java.io.Serializable;

/**
 * @author xuyangyang
 */
public class DoOrderRequest implements Serializable {

    private static final long serialVersionUID = -7632617113217392307L;


    private String name;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DoOrderRequest{" +
                "name='" + name + '\'' +
                '}';
    }
}
