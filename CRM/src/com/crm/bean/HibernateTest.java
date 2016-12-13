package com.crm.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

    public static void main(String[] args) {
    	Configuration cfg = null;
        //读取hibernate.cfg.xml文件  
        StandardServiceRegistry registry = null;
        //建立SessionFactory  
        SessionFactory factory = null;
        //取得session  
        Session session = null;
        
        try {
        	cfg = new Configuration().configure();
        	System.out.println("hehe");
        	cfg.addClass(Country.class);
        	registry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
        	System.out.println("hehe");
        	factory = cfg.buildSessionFactory(registry);//new MetadataSources(registry).buildMetadata().buildSessionFactory();
        	System.out.println("hehe");
            session = factory.openSession();
            //开启事务  
            session.beginTransaction();
            Country country = new Country();
            country.setName("test");
            country.setCode("test");
            /*User user = new User();
            user.setId(2);
            user.setUserId("test");
            user.setUserName("test");
            user.setPassword("test");*/

            //保存User对象  
            session.save(country);
            session.getTransaction().commit();
            System.out.println("hehe");
        }catch(Exception e) {  System.out.println("hehe");
            e.printStackTrace();System.out.println("hehe");
            //回滚事务  
            session.getTransaction().rollback();  
        }finally {  System.out.println("hehe");
            if (session != null) {  
                if (session.isOpen()) {  
                    //关闭session  
                    session.close();  
                }  
            }  
        }  
    }
}