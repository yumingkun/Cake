package com.cake.common;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;



public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;

    static {

        String resource="config.xml";
        try {
            reader=Resources.getResourceAsReader(resource);
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession openSession(){
        return sqlSessionFactory.openSession();
    }

}
