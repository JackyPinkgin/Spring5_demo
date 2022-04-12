package testdemo;

import com.jacky.spring5.bean.Orders;
import com.jacky.spring5.collectiontype.Book;
import com.jacky.spring5.collectiontype.Course;
import com.jacky.spring5.collectiontype.Stu;
import com.jacky.spring5.factorybean.MyBean;
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

    @Test
    public void testCollection2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext5.xml");
        Book book = context.getBean("book",Book.class);
        book.test();

    }

    @Test
    public void testCollection3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext6.xml");
        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);
    }

    @Test
    public void testCollection4(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext7.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders);
        //手动让bean销毁
        context.close();

    }
}
