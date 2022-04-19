package com.stc.client.conf;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * User: job
 * Date: 18/04/22
 * Time: 21:11
 *
 * @author job
 */
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "datasource.mysql")
@Data
public class MysqlDatasourceConf {
    private String url;
    private String username;
    private String password;
    private String driverClassName;

    @Bean(name = "mysqlDatasource")
    public DataSource builMysqlDatasource(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setUrl(this.url);
        driverManagerDataSource.setUsername(this.username);
        driverManagerDataSource.setPassword(this.password);
        driverManagerDataSource.setDriverClassName(this.driverClassName);
        return driverManagerDataSource;
    }

}
