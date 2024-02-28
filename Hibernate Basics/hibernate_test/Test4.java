//-------------Update JAVA objects in DB-------------//

package hibernate_test;

import hibernate_test.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("spring_introduction/hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
   try {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
//        Employee emp = session.get(Employee.class, 1);
//        emp.setSalary(1500);

       session.createQuery("update Employee set salary=1000 " +
               "where name = 'Temur'").executeUpdate();

        session.getTransaction().commit();

        System.out.println("!!DONE!!");
    }
    finally {
       factory.close();
   }
    }
}
