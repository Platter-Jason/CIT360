package Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManageEmployee {

    private static SessionFactory factory;

    public static void main(String[] args) {

        factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        Employee emp0 = new Employee("Bill", "Gates", 100000000);
        Employee emp1 = new Employee("Donald", "Trump", 0);
        Employee emp2 = new Employee("Elon", "Musk", 3000000);
        Employee emp3= new Employee("Steve", "Jobs", 4000000);

        try {

            session.beginTransaction();

            session.save(emp0);
            session.save(emp1);
            session.save(emp2);
            session.save(emp3);

            session.getTransaction().commit();

        } finally  {

            factory.close();
        }



    }
}