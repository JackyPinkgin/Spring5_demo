package com.jacky.spring5.factorybean;

import com.jacky.spring5.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * 2022/4/8
 */
//applicationContext6
public class MyBean implements FactoryBean<Course>  {

    //定义返回bean
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("Java");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
