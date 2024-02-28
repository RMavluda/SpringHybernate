package hybernate_one_to_one;

import hybernate_one_to_one.entity.Detail;
import hybernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("spring_introduction/hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
    Session session = null;
   try {
//        Session session = factory.getCurrentSession();
//        Employee employee = new Employee("Mavluda", "Rahimquli",
//                "IT", 400);
//        Detail detail = new Detail("Uzbekistan", "987654321",
//                "rahimqulimavluda@gmail.com");
//        employee.setEmpDetail(detail);
//        session.beginTransaction();
//
//        session.save(employee);
//
//        session.getTransaction().commit();
//
//        System.out.println("DONE!");

//       Session session = factory.getCurrentSession();
//       Employee employee = new Employee("Temur", "Rahimquli",
//               "Data Analist", 800);
//       Detail detail = new Detail("Uzbekistan", "125489430",
//               "raximquliev@gmail.com");
//       employee.setEmpDetail(detail);
//       session.beginTransaction();
//
//       session.save(employee);
//
//       session.getTransaction().commit();
//
//       System.out.println("DONE!");

//       session = factory.getCurrentSession();
//
//       session.beginTransaction();
//       Employee emp = session.get(Employee.class, 10);
//       System.out.println(emp.getEmpDetail());
//
//       session.getTransaction().commit();
//
//       System.out.println("DONE!");

       session = factory.getCurrentSession();

       session.beginTransaction();
       Employee emp = session.get(Employee.class, 0);
       session.delete(emp);

       session.getTransaction().commit();

       System.out.println("DONE!");
    }
    finally {
       session.close();
       factory.close();
   }
    }
}
