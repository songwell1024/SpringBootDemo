package com.demo.springbootdemo02.Config;

import com.demo.springbootdemo02.Service.helloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration指明这是一个配置类，代替的是之前的spring配置组件
 * 在Spring组件中是使用<bean><bean/>标签添加到容器中的
 */
@Configuration
public class myConfig {

    /**
     *就是将方法的返回值添加到容器中，容器中这个组件默认的id是方法的名称
     * 就是这里的id = helloService;
     */
    @Bean
    public helloService helloService(){
        return new helloService();
    }
}
