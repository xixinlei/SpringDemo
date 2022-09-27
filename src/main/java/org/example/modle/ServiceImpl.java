package org.example.modle;

import org.example.interfaces.service;

public class ServiceImpl implements service {
    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int avg(int a, int b) {
        return (a + b) / 2;
    }
}
