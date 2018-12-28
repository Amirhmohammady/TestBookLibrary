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

    public void insert(BookTO bookTO){
        openSession();

        closeSession();
    }
    public void update(BookTO bookTO){
        openSession();
        session.saveOrUpdate(bookTO);
        closeSession();
    }
    public void remove(long ID){
        openSession();
        closeSession();
    }
    public List<BookTO> search(){
        openSession();
        List<BookTO> contactTOs = session.createQuery("from com.LibBookCo.BookLibrary.model.TOs.BookTO").list();
        closeSession();
        return null;
    }
    public void openSession() {
        try {
            session= HibernateUtil.getSessin();
        transaction = session.beginTransaction();
        }catch (Exception e) {
            System.out.println(e);
        }
    }
    public void closeSession() {
        //session.saveOrUpdate(personTO);
        transaction.commit();
        session.close();
    }
}
