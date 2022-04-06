package testdemo;

import com.jacky.spring5.collectiontype.Stu;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 2022/4/2
 */
public class TestSpring5Demo1 {

    @Test
    public void testCollection(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext4.xml");
        Stu stu = context.getBean("stu1",Stu.class);
        stu.test();
    }
}
