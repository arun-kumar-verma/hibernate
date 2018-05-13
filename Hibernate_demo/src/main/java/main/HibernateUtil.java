package main;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Employee;

public class HibernateUtil {

	public static void main(String[] args) throws SecurityException, IllegalStateException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
		// TODO Auto-generated method stub
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Transaction trans=session.beginTransaction();
		Employee emp=new Employee();
		emp.setEmpname("amrit");
		emp.setEmpdesignation("CTO");
		emp.setEmpsalary(10000);
		System.out.println("1");
		session.persist(emp);
		System.out.println("save successfull");
		trans.commit();
		System.out.println("getting records");
		emp=session.get(Employee.class, 0);
		System.out.println("name: "+emp.getEmpname()+" designation: "+emp.getEmpdesignation()+" salary: "+emp.getEmpsalary());
		session.close();
	}

}
