package testdemo;

import com.jacky.spring5.bean1.Emp;
import com.jacky.spring5.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 2022/4/2
 */
public class TestBean {

    @Test
    public void testBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test
    public void testBean2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Emp emp = context.getBean(Emp.class);
        emp.add();
    }


}
