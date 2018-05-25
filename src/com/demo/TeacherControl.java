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
        // 解决冲突
        t.setAge(12);
        t.setName("jim");
        System.out.println(t.getAge());
        System.out.println(t.toString());
    }

    @Test
    public void test02() {
        Teacher t = new Teacher("tom",13);
        logger.info("============="+t.getName());
        logger.info("============="+t.getAge());
        System.out.println("============"+t.toString());
    }
}
