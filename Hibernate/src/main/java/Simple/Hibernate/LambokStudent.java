package Simple.Hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LambokStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Configuration conf=new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sf=conf.buildSessionFactory();
		Session ses=sf.openSession();
		ses.beginTransaction();
		Student s1=new Student();
		//s1.setStId(101)
		//s1.stName("ganesha");
		//s1.stCourse("MCA");
		
		ses.getTransaction().commit();
		
		
		

	}

}
