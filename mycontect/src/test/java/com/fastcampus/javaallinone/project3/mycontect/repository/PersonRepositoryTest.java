package com.fastcampus.javaallinone.project3.mycontect.repository;

import com.fastcampus.javaallinone.project3.mycontect.domain.Person;
import com.fastcampus.javaallinone.project3.mycontect.domain.dto.Birthday;
import org.apache.tomcat.jni.Local;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersonRepositoryTest {
    @Autowired
    private PersonRepository personRepository;

    @Test
    void crud(){
        Person person = new Person();
        person.setName("john");
        person.setAge(10);
        person.setBloodType("A");

        personRepository.save(person);

//        System.out.println(personRepository.findAll());

//        List<Person> people = personRepository.findAll();

        List<Person> result = personRepository.findByName("john");

        assertThat(result.size()).isEqualTo(1);
        assertThat(result.get(0).getName()).isEqualTo("john");
        assertThat(result.get(0).getAge()).isEqualTo(10);
        assertThat(result.get(0).getBloodType()).isEqualTo("A");
    }

    @Test
    void constructorTest(){
        Person person = new Person("martin", 10, "A");
    }

//    @Test
//    void hashCodeAndEquals() {
//        Person person1 = new Person("martin", 10, "A");
//        Person person2 = new Person("martin", 10, "A");
//
//        System.out.println(person1.equals(person2));
//        System.out.println(person1.hashCode());
//        System.out.println(person2.hashCode());
//
//        Map<Person, Integer> map = new HashMap<>();
//        map.put(person1, person2.getAge());
//
//        System.out.println(map);
//        System.out.println(map.get(person2));
//    }

    @Test
    void findByBloodType(){
//        givenPerson("martin", 10, "A");
//        givenPerson("david", 9, "A");
//        givenPerson("dennis", 8, "O");
//        givenPerson("sophia", 7, "AB");
//        givenPerson("john", 5, "A");

        List<Person> result = personRepository.findByBloodType("A");

//        result.forEach(System.out::println);
        assertThat(result.size()).isEqualTo(2);
        assertThat(result.get(0).getName()).isEqualTo("martin");
        assertThat(result.get(1).getName()).isEqualTo("denny");
    }

    @Test
    void findByBirthdayBetween(){
//        givenPerson("martin", 10, "A", LocalDate.of(1991,8,15));
//        givenPerson("david", 9, "A", LocalDate.of(1992, 7, 10));
//        givenPerson("dennis", 8, "O", LocalDate.of(1993, 1, 5));
//        givenPerson("sophia", 7, "AB", LocalDate.of(1994, 6, 30));
//        givenPerson("john", 5, "A", LocalDate.of(1995, 8, 30));

        List<Person> result = personRepository.findByMonthOfBirthday(2);

//        result.forEach(System.out::println);
        assertThat(result.size()).isEqualTo(2);
        assertThat(result.get(0).getName()).isEqualTo("martin");
        assertThat(result.get(1).getName()).isEqualTo("sophia");
    }

    private void givenPerson(String name, int age, String bloodType){
        givenPerson(name, age, bloodType, null);
    }

    private void givenPerson(String name, int age, String bloodType, LocalDate birthday){
        Person person = new Person(name, age, bloodType);
        person.setBirthday(new Birthday(birthday));
        personRepository.save(person);
    }

}