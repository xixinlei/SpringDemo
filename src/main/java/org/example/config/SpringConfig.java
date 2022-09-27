package org.example.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.proxy.DruidDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.processing.SupportedAnnotationTypes;
import javax.sql.DataSource;

@Configuration  //配置类
@ComponentScan(basePackages = "org.example")//开启注解组件扫描
@EnableTransactionManagement //开启事务
public class SpringConfig {
    //创建数据库连接池
    @Bean
    public DruidDataSource getDruidDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/user_db");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("123456");
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return druidDataSource;
    }

    //    创建jdbccomplete对象
    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
        JdbcTemplate template = new JdbcTemplate();
        template.setDataSource(dataSource);

        return template;
    }

    //    创建事务管理器
    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource) {
        DataSourceTransactionManager manager = new DataSourceTransactionManager();
        manager.setDataSource(dataSource);
        return manager;
    }


}

