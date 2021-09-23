package atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @auther zzyy
 * @create 2020-02-18 17:27
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced   //自定义负载均衡轮训的时候这个要注释掉
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
//applicationContext.xml <bean id="" class="">