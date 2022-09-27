package org.example.dao;

import org.example.entity.User;

import java.util.List;

public interface UserDao {
    public void addUser(User user);
    public void addBatchUser(List<Object[]> userList);
    public void updateUser(User user);
    public void batchUpdateUser(List<Object[]> userList);
    public void deleteUser(int id);
    public void batchDeleteUser(List<Object[]> ids);
    public int findcount();
    public User findUser(int id);
    public List<User> findAllUser();
}
