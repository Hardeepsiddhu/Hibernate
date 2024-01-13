package in.co.rays.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.co.rays.dto.UserDTO;

public class TestAdd {
	public static void main(String[] args) {
		
	

	
		UserDTO dto = new UserDTO();
		dto.setId(1);
		dto.setFirstName("hardeep");
		dto.setLastName("sidhu");
		dto.setAddress("kota");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(dto);
		tx.commit();
		session.close();
	}
}
