package testdemo;

import com.jacky.spring5.Book;
import com.jacky.spring5.Orders;
import com.jacky.spring5.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 2022/3/31
 */
public class TestSpring5 {


    @Test
    public void testAdd(){

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean(User.class);

        System.out.println(user);
        user.add(555);
    }

    @Test
    public void testBook1(){
        ApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Book book = context.getBean(Book.class);
        Book book = context.getBean("book",Book.class);
        book.testDemo();
    }

    @Test
    public void testOrders(){
        ApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Book book = context.getBean(Book.class);
        Orders order = context.getBean(Orders.class);
        order.ordersTest();
    }


}
