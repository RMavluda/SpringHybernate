package hibernate_one_to_many_uni;

import hibernate_one_to_many_uni.entity.Department;
import hibernate_one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("spring_introduction/hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
    Session session = null;
   try {
//       session = factory.getCurrentSession();
//       Department dep = new Department("HR",1000, 2500);
//       Employee emp1 = new Employee("July", "Werner", 1400);
//       Employee emp2 = new Employee("Ennie", "Stif", 900);
//
//       dep.addEmployeeToDepartment(emp1);
//       dep.addEmployeeToDepartment(emp2);
//
//       session.beginTransaction();
//       session.save(dep);
//
//
//       session.getTransaction().commit();
//       System.out.println("DONE!");
//******************************************************************
//
//       session = factory.getCurrentSession();
//       session.beginTransaction();
//
//       Department department = session.get(Department.class, 4);
//
//       System.out.println(department);
//       System.out.println(department.getEmps());
//
//       session.getTransaction().commit();
//       System.out.println("DONE!");
//******************************************************************
       session = factory.getCurrentSession();
       session.beginTransaction();

       Department department  = session.get(Department.class, 4);

       session.delete(department);

       session.getTransaction().commit();
       System.out.println("DONE!");
//******************************************************************
    }
    finally {
       session.close();
       factory.close();
   }
    }
}
