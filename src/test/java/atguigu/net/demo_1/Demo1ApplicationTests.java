package atguigu.net.demo_1;

import atguigu.net.demo_1.domain.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo1ApplicationTests {
    @Autowired
    private Person person;

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    /**
     * 测试ioc容器中是否包含某个bean
     */
    public void isContext(){
       boolean b= applicationContext.containsBean("helloService");
       System.out.println(b);
    }
    @Test
    public void testelloService(){

        boolean b=applicationContext.containsBean("elloService");
        System.out.println(b);
    }



   @Test
    public void contextLoads() {

        System.out.println(person);
    }

}
