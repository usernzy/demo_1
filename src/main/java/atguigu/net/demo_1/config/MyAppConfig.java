package atguigu.net.demo_1.config;

import atguigu.net.demo_1.domain.Dog;
import atguigu.net.demo_1.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration:指明当前类是一个配置类，就是来替代之前的spring xml格式的配置文件的
 *
 */
@Configuration
public class MyAppConfig {
    /**
     * @Bean注解
     * 将方法的返回值添加到容器中，容器中这个组件默认的id就是方法名
     *
     */
    @Bean
   public HelloService elloService(){
        return  new HelloService();
    }
}
