package Simple.Hibernate;
// Displaying user information using hibernate and getter and setter method
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating configuration to craete or upadte the tabel
		  Configuration conf=new Configuration().configure().addAnnotatedClass(User.class);
		  // creating sessionfactory
		     SessionFactory sf=conf.buildSessionFactory();
		     Session ses=sf.openSession();
		     ses.beginTransaction();
		     User u1=new User();
		     u1=ses.get(User.class,101);
		     User u2=new User();
		     u2=ses.get(User.class,102);
		     User u3=new User();
		     u3=ses.get(User.class,103);
		     // Displaying user details
		     
		     System.out.println(u1);
		     System.out.println(u2);
		     System.out.println(u3);
		     ses.getTransaction().commit();

	} 

}
