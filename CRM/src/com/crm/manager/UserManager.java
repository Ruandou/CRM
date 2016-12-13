package com.crm.manager;

import java.util.List;

import org.hibernate.HibernateException;

import com.crm.dao.BaseDao;
import com.crm.dao.impl.UserDao;
import com.crm.bean.User;

public class UserManager {
    private UserDao dao;  

    public UserManager(){
        dao = new UserDao();
        System.out.println("UserManager IN");
    }

    public UserDao getDao() {
        return dao;
    }

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    public User getUsers() throws HibernateException {  
        return dao.getUser();
    } 
}