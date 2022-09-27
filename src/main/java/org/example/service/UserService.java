package org.example.service;

import org.example.entity.User;
import org.example.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;


    //添加的方法
    public void addUser(User user) {
        userDao.addUser(user);
    }

    //批量添加的方法
    public void addBatchUser(List<Object[]> userList) {
        userDao.addBatchUser(userList);
    }

    //修改的方法
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    //批量修改方法
    public void batchUpdateUser(List<Object[]> list) {
        userDao.batchUpdateUser(list);
    }

    //删除的方法
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

    //批量删除
    public void batchDeleteUser(List<Object[]> ids) {
        userDao.batchDeleteUser(ids);
    }

    //查询一共有多少条数据
    public int findcount() {
        return userDao.findcount();
    }

    //查询一条数据
    public User findUser(int id) {
        return userDao.findUser(id);
    }

    //查询集合数据
    public List<User> findAllUser() {
        return userDao.findAllUser();
    }
}
