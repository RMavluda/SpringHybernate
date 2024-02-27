package hibernate_test;

import hibernate_test.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("spring_introduction/hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
   try {
        Session session = factory.getCurrentSession();
        session.beginTransaction();

        //create query
//       List<Employee> emps = session.createQuery("from Employee")
//                       .getResultList();

       List<Employee> emps = session.createQuery("from Employee " +
                       "where name = 'Temur' AND salary>550")
                        .getResultList();

       for(Employee e: emps){
            System.out.println(e);
        }
        session.getTransaction().commit();

        System.out.println("!!DONE!!");
    }
    finally {
       factory.close();
   }
    }
}
