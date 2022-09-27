package org.example.modle;

import org.apache.commons.logging.Log;

/*
生命周期练习

 */
public class Orders {
    private String o_name;
    private int id;

    public Orders() {
        System.out.println("无参构造器");
    }

    public String getO_name() {
        return o_name;
    }

    public void setO_name(String o_name) {
        System.out.println("set方法");
        this.o_name = o_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private void initMethod() {
        System.out.println("init方法");
    }

    private void destroyMethod() {
        System.out.println("detroy方法");
    }
}
