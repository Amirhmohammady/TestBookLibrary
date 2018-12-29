package com.LibBookCo.BookLibrary.model.bl;

import com.LibBookCo.BookLibrary.model.TOs.BookTO;
import com.LibBookCo.BookLibrary.model.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by Amir on 12/10/2018.
 */
public class BookManager {
    private Session session;
    private Transaction transaction;

    public long insert(BookTO bookTO) {
        openSession();
        long t = 0;
        if (session != null) t = (long) session.save(bookTO);
        closeSession();
        return t;
    }

    public void update(BookTO bookTO) {
        openSession();
        if (session != null) session.saveOrUpdate(bookTO);
        closeSession();
    }

    public void remove(long ID) {
        openSession();
        closeSession();
    }

    public List<BookTO> search() {
        openSession();
        List<BookTO> contactTOs;
        if (session != null) contactTOs = session.createQuery("from com.LibBookCo.BookLibrary.model.TOs.BookTO").list();
        closeSession();
        return null;
    }

    public void openSession() {
        try {
            session = new HibernateUtil().getSessin();
            transaction = session.beginTransaction();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void closeSession() {
        //session.saveOrUpdate(personTO);
        try {
            if (transaction != null) transaction.commit();
            if (session != null) session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
