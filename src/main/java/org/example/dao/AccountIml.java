package org.example.dao;


import org.example.entity.AccountEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountIml implements Account{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addBalance(int id,double amount) {
        String sql  = "update account set balance = balance+? where id = ?";

        jdbcTemplate.update(sql,amount,id);
    }

    @Override
    public void reduceBalance(int id,double amount) {
        String sql  = "update account set balance = balance-? where id = ?";

        jdbcTemplate.update(sql,amount,id);
    }

    @Override
    public AccountEntity selectAccountForId(int id) {
        String sql = "select * from account where id = ?";

        AccountEntity account = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<AccountEntity>(AccountEntity.class), id);
        return account;
    }

}
