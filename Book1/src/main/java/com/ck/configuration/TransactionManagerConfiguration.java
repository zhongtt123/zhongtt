package com.ck.configuration;


import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author 钟婷婷
 * @Date
 */
@Configuration
@EnableTransactionManagement
public class TransactionManagerConfiguration {
    @Autowired
    private ComboPooledDataSource c3p0;

    public DataSourceTransactionManager transactionManager(){
        DataSourceTransactionManager manager = new DataSourceTransactionManager();
        manager.setDataSource(c3p0);
        return manager;
    }
}
