package org.example;

import org.example.model.Item;
import org.example.model.Person;
import org.hibernate.PersistentObjectException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SessionFactoryObserver;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
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

            Person person = session.get(Person.class, 3);

            Item item = session.get(Item.class, 3);
            // удаляем у старого владельца данный товар
            item.getOwner().getItems().remove(item);
            // устанавливаем товару нового владельца
            item.setOwner(person);
            // новому владельцу добавляем новый товар в список его товаров
            person.getItems().add(item);



            session.getTransaction().commit();

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

        // получение человека и вывод его товаров
//            Person person = session.get(Person.class, 2);
//            System.out.println(person);
//
//            List<Item> items = person.getItems();
//
//            System.out.println(items);

        // получение товара и вывод владельца
//            Item item = session.get(Item.class, 5);
//            System.out.println(item);
//
//            System.out.println(item.getOwner());

        // получение человека и добавление ему товара
//            Person person = session.get(Person.class, 2);
//            Item newItem = new Item("Item from Hibernate", person);
//            person.getItems().add(newItem);  // задали отношение человеку тоже, двухсторонняя связь
//            session.persist(newItem);


        // создание человека и его товара
//            Person person = new Person("New person", 32);
//            Item item = new Item("laptop", person);
//            person.setItems(List.of(item));
//
//            session.persist(person);
//            session.persist(item);

        // удаление товаров человека
//            Person person = session.get(Person.class, 3);
//            List<Item> items = person.getItems();
//
//            // SQL
//            for (Item item : items) {
//                session.remove(item);
//            }
//            // двухсторонняя связь, необходимо для того, чтобы в кэше все было верно
//            person.getItems().clear();

        // удаление человека
//            Person person = session.get(Person.class, 2);
//
//            session.remove(person);
//
//            // Для правильного состояния кеша (обновляем данные, не дожидаясь рефреша хибернейта)
//            person.getItems().forEach(i -> i.setOwner(null));
    }
}
