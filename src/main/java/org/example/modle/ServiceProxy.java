package org.example.modle;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ServiceProxy implements InvocationHandler {

    private Object object;

    public ServiceProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (method.getName().equals("sum")) {
            System.out.println("sum" + Arrays.toString(args));
        } else if (method.getName().equals("avg")) {
            System.out.println("avg" + Arrays.toString(args));
        }
        Object invoke = method.invoke(object, args);
        return invoke;
    }
}
