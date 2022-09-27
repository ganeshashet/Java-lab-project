package Simple.Hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentLaptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration conf=new Configuration().configure().addAnnotatedClass(Student1.class).addAnnotatedClass(Laptop.class);
		SessionFactory sf=conf.buildSessionFactory();
		Session ses=sf.openSession();
		ses.beginTransaction();
		Student1 s1=new Student1();
		s1.setS1id(101);
		s1.setS1name("ganesha");
		s1.setS1branch("mca");
		Laptop l1=new Laptop();
		l1.setLid(1001);
		l1.setCompany("Hp");
		l1.setModel("probook");
		Laptop l2=new Laptop();
		l2.setLid(1002);
		l2.setCompany("Dell");
		l2.setModel("Note");
		Laptop l3=new Laptop();
		l3.setLid(1003);
		l3.setCompany("Mac");
		l3.setModel("Notebook");
		List<Laptop> ll=new ArrayList<Laptop>();
		ll.add(l1);
		ll.add(l2);
		ll.add(l3);
		
		s1.setStuLap(ll);
		ses.save(s1);
		ses.save(l1);
		ses.save(l2);
		ses.save(l3);
		
		ses.getTransaction().commit();
		

	}

}
