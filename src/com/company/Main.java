package com.company;

import com.fz.entity.Student;
import com.fz.mapper.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        //建立数据库会话工厂
        SqlSessionFactory sf = null;
        try {
            sf = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
            //System.out.println(sf);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //读取会话
        SqlSession s = sf.openSession();
       // System.out.println(s);

        //实现删除操作
        //s.delete("deleteById",2);

        //实现查询操作 返回List结果
        /*List<Student> sts = s.selectList("query");
        System.out.println(sts.size());
        for (Student st : sts) {
            System.out.println(st.getName());
        }*/
        StudentMapper sm = s.getMapper(StudentMapper.class);

        Student student = new Student();
        student.setName("jacks");
        student.setScore(20);
        student.setAddress("上海");


        int n = sm.insert(student);
        System.out.println(n);

        int m = sm.insertinto(student);
        System.out.println(m);
        s.commit();
    }
}
