package org.example.modle;

import org.springframework.stereotype.Component;

/*
被增强的类
 */
@Component
public class AopBean {

    public void add(String string) {
        System.out.println(string);
    }
}
