//-------------Removing Java objects from the database-------------//

package hibernate_test;

import hibernate_test.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("spring_introduction/hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
   try {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
//        Employee emp = session.get(Employee.class, 1);
//        session.delete(emp);

       session.createQuery("delete Employee " +
               "where name = 'Sofiya'").executeUpdate();

        session.getTransaction().commit();

        System.out.println("!!DONE!!");
    }
    finally {
       factory.close();
   }
    }
}
