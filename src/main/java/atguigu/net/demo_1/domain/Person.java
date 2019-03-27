package atguigu.net.demo_1.domain;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.Email;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import  java.util.*;

/**
 * 将配置文件中配置的每一个属性的值,映射到这个组件中
 * @ConfigurationProperties 告诉springboot将本类中的所有属性和配置文件中相关的
 * 配置进行绑定;
 * prefix="person"  配置文件中哪个下面的属性进行一一映射
 * 只有这个组件是容器中的组件，才能有容器提高的@ConfugurationProperties功能，
 * 所以需要加上  @Component
 * @ConfigurationProperties(prefix="person") 默认从全局配置文件中获取值
 */
@Component
@ConfigurationProperties(prefix = "person")
@Validated
@PropertySource("classpath:person.properties")
public class Person {
    //@Value("${person.last-name}")

    private String lastName;
   /* @Value("#{2*11}")*/
    private Integer age;
   /* @Value("true")*/
    private  Boolean  boss;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",locale = "zh",timezone = "GMT+8")
    private  Date birth;
/*    @Value("person.maps.key1")*/
    private Map<String,Object> maps;
    private List<Object> lists;
    private  Dog dog;
    public String getLastName() {
        return lastName;
    }
    public Integer getAge() {
        return age;
    }
    public Boolean getBoss() {
        return boss;
    }

    public Date getBirth() {
        return birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }
}
