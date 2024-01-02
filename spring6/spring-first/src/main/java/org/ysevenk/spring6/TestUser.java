package org.ysevenk.spring6;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class TestUser {

    @Test
    public void testUserObject() {
        // 加载配置文件，对象创建
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 获取创建对象
        User user = (User) context.getBean("user");
        System.out.println("1." + user);

        // 调用方法测试
        System.out.print("2.");
        user.add();
    }

    // 反射创建对象
    @Test
    public void testUserObject1() throws Exception {
        // 获取类class对象
        Class clazz = Class.forName("org.ysevenk.spring6.User");

        // 调用方法
        User user = (User) clazz.getDeclaredConstructor().newInstance();
        System.out.println(user);
    }

}
