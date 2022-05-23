package com.atguigu.factoryBean;

import com.atguigu.spring5.collectionTest.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author ccstart
 * @create 2022-04-20 10:02
 */
public class MyBean implements FactoryBean<Course> {


    @Override
    public Course getObject() throws Exception {

        return new Course();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
