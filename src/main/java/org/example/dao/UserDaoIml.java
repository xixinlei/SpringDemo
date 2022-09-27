package org.example.dao;

import org.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class UserDaoIml implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addUser(User user) {
        String sql = "INSERT INTO users VALUES(?,?,?)";
        Object[] args = {user.getUserId(), user.getUserName(), user.getUstatus()};
        int update = jdbcTemplate.update(sql, args);
        System.out.printf(update + "行");
    }

    @Override
    public void addBatchUser(List<Object[]> userList) {
        String sql = "INSERT INTO users VALUES(?,?,?)";
        int[] update = jdbcTemplate.batchUpdate(sql, userList);
        System.out.printf(Arrays.toString(update) + "行");
    }


    @Override
    public void updateUser(User user) {
        String sql = "UPDATE users SET userName = ?,ustatus = ? WHERE id = ?";
        Object[] args = {user.getUserName(), user.getUstatus(), user.getUserId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.printf(update + "行");

    }

    @Override
    public void batchUpdateUser(List<Object[]> userList) {
        String sql = "UPDATE users SET userName = ?,ustatus = ? WHERE id = ?";
        int[] update = jdbcTemplate.batchUpdate(sql, userList);
        System.out.printf(Arrays.toString(update) + "行");
    }

    @Override
    public void deleteUser(int id) {
        String sql = "DELETE FROM users WHERE id = ?";
        int update = jdbcTemplate.update(sql, id);
        System.out.printf(update + "行");
    }

    @Override
    public void batchDeleteUser(List<Object[]> ids) {
        String sql = "DELETE FROM users WHERE id = ?";
        int[] update = jdbcTemplate.batchUpdate(sql, ids);
        System.out.printf(Arrays.toString(update) + "行");
    }

    @Override
    public int findcount() {
        String sql = "SELECT COUNT(*) FROM users";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
        return integer;
    }

    @Override
    public User findUser(int id) {
        String sql = "select * from users where id = ?";
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), id);
        return user;
    }

    @Override
    public List<User> findAllUser() {
        String sql = "select * from users";
        List<User> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return query;
    }
}
