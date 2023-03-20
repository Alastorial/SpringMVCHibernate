package org.example;

import org.example.model.Actor;
import org.example.model.Item;
import org.example.model.Movie;
import org.example.model.Passport;
import org.example.model.Person;
import org.hibernate.Hibernate;
import org.hibernate.PersistentObjectException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SessionFactoryObserver;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration()
                .addAnnotatedClass(Person.class)
                .addAnnotatedClass(Item.class)
                .addAnnotatedClass(Passport.class)
                .addAnnotatedClass(Actor.class)
                .addAnnotatedClass(Movie.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        try (sessionFactory) {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            Person person = session.get(Person.class, 1);
            Hibernate.initialize(person.getItems());  // подгрузили связанные сущности, чтобы иметь к ним доступ после завершения транзакции

            session.getTransaction().commit();

        }
//        finally {
//            sessionFactory.close();
//
//        }




    }

    private static void workWithActorsAndFilms() {
        // добавили фильм актеру
//            Movie movie = new Movie("Reservoid Dogs", 1992);
//            Actor actor = session.get(Actor.class, 1);
//
//            movie.setActors(new ArrayList<>(Collections.singletonList(actor)));
//            actor.getMovies().add(movie);
//
//            session.persist(movie);
        //            Movie movie = new Movie("Pulp fiction", 1994);
//            Actor actor1 = new Actor("Harvey Keitel", 81);
//            Actor actor2 = new Actor("Samuel L. Jackson", 72);
//
//            movie.setActors(new ArrayList<>(List.of(actor1, actor2)));
//
//            actor1.setMovies(new ArrayList<>(Collections.singletonList(movie))); // обратная связь
//            actor2.setMovies(new ArrayList<>(Collections.singletonList(movie)));
//
//            session.persist(movie);
//            session.persist(actor1);
//            session.persist(actor2);
    }


        private static void workWithPersonAndPassport() {
        // создание человека с паспортом (один к одному)
        //            Person person = new Person("test person pasp2", 50);
//            Passport passport = new Passport(123322);
//
//            person.setPassport(passport);  // двухсторонняя связь
//
//            session.persist(person);
    }

    private static void workWithPersonAndItems() {
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

        // изменяем товару владельца
//            Person person = session.get(Person.class, 3);
//
//            Item item = session.get(Item.class, 3);
//            // удаляем у старого владельца данный товар
//            item.getOwner().getItems().remove(item);
//            // устанавливаем товару нового владельца (строчка с SQL запросом)
//            item.setOwner(person);
//            // новому владельцу добавляем новый товар в список его товаров
//            person.getItems().add(item);
    }
}
