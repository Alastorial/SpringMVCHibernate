package org.example;

import org.example.model.Item;
import org.example.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SessionFactoryObserver;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().addAnnotatedClass(Person.class).addAnnotatedClass(Item.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

//            Person person = session.get(Person.class, 2);
//            System.out.println(person);
//
//            List<Item> items = person.getItems();
//
//            System.out.println(items);

//            Item item = session.get(Item.class, 5);
//            System.out.println(item);
//
//            System.out.println(item.getOwner());

//            Person person = session.get(Person.class, 2);
//            Item newItem = new Item("Item from Hibernate", person);
//            session.persist(newItem);


            session.getTransaction().commit();

//            System.out.println(person1.getId());
        } finally {
            sessionFactory.close();

        }




    }

    private static void extracted() {
//        Person person1 = new Person("Tom", 33);
        //            Person person2 = new Person("Kate", 23);
//            Person person3 = new Person("Lisa", 52);
//            session.persist(person1);
//            session.persist(person2);
//            session.persist(person3);

//            Person person = session.get(Person.class, 2);
//            person.setName("New name");
//            session.remove(person);

//            List<Person> people = session.createQuery("FROM Person where age = 30").getResultList();
//            session.createQuery("update Person set name = 'Testnew' where age < 30").executeUpdate();
//            session.createQuery("delete from Person where age < 30").executeUpdate();
//            for (Person p : people) {
//                System.out.println(p);
//                p.setName("Test");
//            }
    }
}
