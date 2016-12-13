package com.crm.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.crm.bean.User;
import com.crm.dao.BaseDao;

public class UserDao implements BaseDao{
    private Session session;
    private User user;
    
    public UserDao(){
        session = HibernateSessionFactory.currentSession();
       }  
    @Override  
    public Session getSession() {  
        return session;  
    }  

    @Override  
    public void setSession(Session session) {  
        this.session = session;  
    }  

    @Override  
    public void saveObject(Object obj) throws HibernateException {  
        session.save(obj);  
    }
    
    public User getUser() {
    	this.session.beginTransaction();
    	
    	this.user = new User();
    	user.setUserId("test");
    	user.setUserName("test");
    	user.setPassword("test");
    	
    	this.session.save(this.user);
    	this.session.getTransaction().commit();
    	
    	return this.user;
    }
}