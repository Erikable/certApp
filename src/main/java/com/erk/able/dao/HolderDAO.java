package com.erk.able.dao;

import com.erk.able.models.Holder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Component
public class HolderDAO {
    private final SessionFactory sessionFactory;

    @Autowired
    public HolderDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional(readOnly = true)
    public List<Holder> index() {
        Session session = sessionFactory.getCurrentSession();
        List<Holder> holders = session.createQuery("SELECT h FROM Holder h", Holder.class).getResultList();
        return holders;
    }
}
