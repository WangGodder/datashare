package top.godder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

// 防止数据源自动配置报错
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//@EnableFeignClients(basePackages = {"top.godder.userapi.service", "top.godder.dataapi.service"})
@EnableFeignClients
@EnableDiscoveryClient
//@ComponentScan
public class UserWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserWebApplication.class, args);
    }

}
