package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("spring_introduction/hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
        Session session = null;

        try{
//*************************************************************************
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("Football");
//            Child child1 = new Child("Tima", 5);
//            Child child2 = new Child("Ely", 9);
//            Child child3 = new Child("Ali", 6);
//
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//
//            session.save(section1);
//
//            session.getTransaction().commit();
//            System.out.println("!!****DONE****!!");
//*************************************************************************
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("Handball");
//            Section section2 = new Section("Chess");
//            Section section3 = new Section("Math");
//            Child child1 = new Child("Malis", 11);
//
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//
//            session.beginTransaction();
//
//            session.save(child1);
//
//            session.getTransaction().commit();
//            System.out.println("!!****DONE****!!");
//*************************************************************************
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 1);
//            System.out.println(section);
//            System.out.println(section.getChildren());
//
//
//
//            session.getTransaction().commit();
//            System.out.println("!!****DONE****!!");
//*************************************************************************
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Child child =session.get(Child.class, 5);
//            System.out.println(child);
//            System.out.println(child.getSections());
//
//
//
//            session.getTransaction().commit();
//            System.out.println("!!****DONE****!!");
//*************************************************************************
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 1);
//            session.delete(section);
//
//
//
//            session.getTransaction().commit();
//            System.out.println("!!****DONE****!!");
//*************************************************************************
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("Dance");
//            Child child1 = new Child("Oly", 11);
//            Child child2 = new Child("Emma", 9);
//            Child child3 = new Child("Hanna", 12);
//
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//
//            session.persist(section1);
//
//            session.getTransaction().commit();
//            System.out.println("!!****DONE****!!");
//*************************************************************************
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 9);
//            session.delete(section);
//
//            session.getTransaction().commit();
//            System.out.println("!!****DONE****!!");
//*************************************************************************
            session = factory.getCurrentSession();

            session.beginTransaction();

            Child child = session.get(Child.class, 8);
            session.delete(child);

            session.getTransaction().commit();
            System.out.println("!!****DONE****!!");

        }finally {
            session.close();
            factory.close();
        }
    }

}
