package org.melon.javacamp.onlineshop.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.melon.javacamp.onlineshop.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Transactional
@Repository
public class AccountDAO {

    @Autowired
    SessionFactory sessionFactory;

    public Account findAccount(String userName){
        Session session = this.sessionFactory.getCurrentSession();
        return session.find(Account.class, userName);
    }
}
