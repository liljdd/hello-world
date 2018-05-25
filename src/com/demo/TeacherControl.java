package com.demo;

import com.bean.Teacher;
import org.junit.Test;

/**
 * @author lilj
 * @date 18/05/25
 */
public class TeacherControl {

    @Test
    public void test01(){
        Teacher t = new Teacher();
        t.setAge(12);
        t.setName("jim");
        System.out.println(t.getAge());
        System.out.println(t.toString());
    }
}
