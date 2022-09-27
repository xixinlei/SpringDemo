package org.example.dao;

public interface Account {
    public void addBalance(int id,double amount);

    public void reduceBalance(int id,double amount);

    public Object selectAccountForId(int id);
}
