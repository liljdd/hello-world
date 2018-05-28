package com.demo;

import com.bean.Teacher;
import org.junit.Test;

import java.util.logging.Logger;

/**
 * @author lilj
 * @date 18/05/25
 */
public class TeacherControl {
    private static final Logger logger = Logger.getLogger("TeacherControl");

    @Test
    public void test01() {
        Teacher t = new Teacher();
        // 解决冲突 yxy
        t.setAge(12);
        t.setName("jim");
        String name = t.getName();
        Integer age = t.getAge();
        System.out.println(age);
        System.out.println(t.toString());
    }

    @Test
    public void test02() {
        // 解决冲突 y一y
        Teacher t = new Teacher("tom",13);
        logger.info("============="+t.getName());
        logger.info("============="+t.getAge());
        System.out.println("============"+t.toString());

    }

}
