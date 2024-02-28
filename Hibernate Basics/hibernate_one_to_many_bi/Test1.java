package hibernate_one_to_many_bi;

import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.SQLOutput;

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
//       Department dep = new Department("QA Testers",500, 1500);
//       Employee emp1 = new Employee("Leyla", "Farhad", 800);
//       Employee emp2 = new Employee("Mona", "Kamil", 1000);
//       Employee emp3 = new Employee("Umi", "Soat", 700);
//
//       dep.addEmployeeToDepartment(emp1);
//       dep.addEmployeeToDepartment(emp2);
//       dep.addEmployeeToDepartment(emp3);
//
//
//       session.beginTransaction();
//       session.save(dep);
//
//
//       session.getTransaction().commit();
//       System.out.println("DONE!");
//**********************************************************************************
       session = factory.getCurrentSession();
       session.beginTransaction();

       System.out.println("Get department");
       Department department = session.get(Department.class, 7);

       System.out.println("Show department");
       System.out.println(department);

       System.out.println("Show employees of the department");
       System.out.println(department.getEmps());

       session.getTransaction().commit();
       System.out.println("DONE!");
//**********************************************************************************
//       session = factory.getCurrentSession();
//       session.beginTransaction();
//
//       Employee employee = session.get(Employee.class, 4);
//
//       session.delete(employee);
//
//       session.getTransaction().commit();
//       System.out.println("DONE!");
    }
    finally {
       session.close();
       factory.close();
   }
    }
}
