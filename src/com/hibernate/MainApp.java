package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	
	public static void main(String[] args) {
		
		Configuration configuration=new Configuration();
		
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory=configuration.buildSessionFactory();
		
		Session session=factory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		ReservationEvent reservationEvent= new ReservationEvent();
		
		reservationEvent.setReservationId(112);
		
		reservationEvent.setUsername("kishore555");
		
		reservationEvent.setPassword("5018");

		session.save(reservationEvent);
		
		transaction.commit();
		
		
		
	}
}
