package com.demo.springbootdemo02.ymlTest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Map;

/**
 * @ConfigurationProperties(prefix = "person")告诉SpringBoot将本类中的相关配置与yml文件中的配置绑定
 * 获取配置前缀person下的配置的一一配置。
 * 并且获取的是全局配置的变量的值
 *
 * @Component组件 也就是这个组件只有是spring容器中的组件才能使用@ConfigurationProperties功能
 *
 * @PropertySource(value = {"classpath:person.properties"})获取的是person.properties这个配置文件下的配置信息
 */

//@PropertySource(value = {"classpath:person.properties"})
@Component
@ConfigurationProperties(prefix = "person")
//@Validated                    //JSR303校验
public class person {

    /**
     * @Value的用法呢其实就是和spring中的下面的用法相同
     * <bean class = "person">
     *     <property name = "last-name" value = "字面值/${kry}从环境变量、配置文件中获取值/#{SpEL}"><property/>
     * <bean/>
     */

//    @Value("${person.name}")
    private String name;
//    @Value("#{11*2}")
    private Integer age;
//    @Value("True")
    private  boolean boss;


    private Map<String, Object> maps;
    private Dog dog;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isBoss() {
        return boss;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", maps=" + maps +
                ", dog=" + dog +
                '}';
    }
}
