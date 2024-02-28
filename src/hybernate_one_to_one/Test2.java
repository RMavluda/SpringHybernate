package hybernate_one_to_one;

import hybernate_one_to_one.entity.Detail;
import hybernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("spring_introduction/hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
    Session session = null;
   try {
//
//        session = factory.getCurrentSession();
//        Employee employee = new Employee("Masha", "Aliyeva",
//                "QA-Testing", 300);
//        Detail detail = new Detail("Moskow", "+7 89 928",
//                "mashaaliyeva@gmail.com");
//        employee.setEmpDetail(detail);
//        detail.setEmployee(employee);
//        session.beginTransaction();
//
//        session.save(detail);
//
//        session.getTransaction().commit();
//
//        System.out.println("DONE!");

//       session = factory.getCurrentSession();
//       session.beginTransaction();
//
//       Detail detail = session.get(Detail.class, 9);
//       System.out.println(detail.getEmployee());
//
//       session.getTransaction().commit();
//       System.out.println("DONE!");

       session = factory.getCurrentSession();
       session.beginTransaction();

       Detail detail = session.get(Detail.class, 8);
       detail.getEmployee().setEmpDetail(null);
       session.delete(detail);
       System.out.println(detail.getEmployee());

       session.getTransaction().commit();
       System.out.println("DONE!");

   }
    finally {
       session.close();
       factory.close();
   }
    }
}
