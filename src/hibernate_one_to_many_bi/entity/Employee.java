package hibernate_one_to_many_bi.entity;

import hybernate_one_to_one.entity.Detail;
import jakarta.persistence.*;

@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="employee_id")
    private int id;
    @Column(name="org_name")
    private String firstName;
    @Column(name="surname")
    private String surname;
    @Column(name="salary")
    private int salary;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.DETACH
            , CascadeType.REFRESH, CascadeType.MERGE})
    @JoinColumn(name="dep_id")
    private Department department;

    public Employee() {
    }

    public Employee( String firstName, String surname, int salary) {
        this.firstName = firstName;
        this.surname = surname;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
