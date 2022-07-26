package com.payment;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Main {
    public static void main(String[] args) {
        Configuration cf=new Configuration();
        cf.configure("hibernate.xml");
        SessionFactory sf= cf.buildSessionFactory();
       Session session= sf.openSession();
        Transaction txn=session.beginTransaction();
        Cheque cq=new Cheque();
        cq.setPid(102);
        cq.setChequetype("SBI");
        cq.setAmount(30000);
        session.save(cq);
        txn.commit();
        session.close();
    }

}


