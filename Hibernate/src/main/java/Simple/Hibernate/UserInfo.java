package Simple.Hibernate;
// Inserting data into database using getter and setter methods and hibernate
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating configuration to craete or upadte the tabel
     Configuration conf=new Configuration().configure().addAnnotatedClass(User.class);
     SessionFactory sf=conf.buildSessionFactory();
     Session ses=sf.openSession();
     ses.beginTransaction();
     // Adding users details to databse table
     User u1=new User();
     u1.setUid(101);
     u1.setUname("Ganesha");
     u1.setUphone("9902903420");
     u1.setPassword("1234");
     User u2=new User();
     u2.setUid(102);
     u2.setUname("Sanju");
     u2.setUphone("9591813175");
     u2.setPassword("4321");
     User u3=new User();
     u3.setUid(103);
     u3.setUname("mohan");
     u3.setUphone("9912345611");
     u3.setPassword("1111");
     ses.save(u3);
     ses.save(u2);
     ses.save(u1);
     ses.getTransaction().commit();
	}

}
