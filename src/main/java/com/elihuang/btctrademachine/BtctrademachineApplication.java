package com.elihuang.btctrademachine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class BtctrademachineApplication {

    /**
     * test git pull
     * @param args
     */
    public static void main(String[] args) {
        // Spring应用启动起来
        SpringApplication.run(BtctrademachineApplication.class, args);
    }

}
