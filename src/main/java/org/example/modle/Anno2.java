package org.example.modle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Anno2 {
    @Value(value = "anno2")
    private String name;
    @Autowired
    @Qualifier(value = "anno1")
    private Anno1 anno1;

    @Override
    public String toString() {
        return "Anno2{" +
                "name='" + name + '\'' +
                ", anno1=" + anno1 +
                '}';
    }
}
