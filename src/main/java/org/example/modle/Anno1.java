package org.example.modle;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//value属性值不写默认值是类名首字母小写
@Component(value = "anno1")//<<bean id = "anno1" class
public class Anno1 {
    @Value(value = "anno1")
    private String name ;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Anno1{" +
                "name='" + name + '\'' +
                '}';
    }
}
