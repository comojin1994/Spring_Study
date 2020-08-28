package com.fastcampus.javaallinone.project3.mycontect.service;

import com.fastcampus.javaallinone.project3.mycontect.domain.Block;
import com.fastcampus.javaallinone.project3.mycontect.domain.Person;
import com.fastcampus.javaallinone.project3.mycontect.repository.BlockRepository;
import com.fastcampus.javaallinone.project3.mycontect.repository.PersonRepository;
import net.minidev.json.JSONUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersonServiceTest {
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private BlockRepository blockRepository;
    @Autowired
    private PersonService personService;

    @Test
    void getPeopleExcludeBlocks(){
//        givenPeople();
//        givenBlocks();

        List<Person> result = personService.getPersonExcludeBlocks();

//        System.out.println(result);
//        result.forEach(System.out::println);
        assertThat(result.size()).isEqualTo(3);
        assertThat(result.get(0).getName()).isEqualTo("marin");
        assertThat(result.get(1).getName()).isEqualTo("david");
        assertThat(result.get(2).getName()).isEqualTo("benny");
    }

//    @Test
//    void cascadeTest(){
//        givenPeople();
//
//        List<Person> result = personRepository.findAll();
//        result.forEach(System.out::println);
//
//        Person person = result.get(3);
//        person.getBlock().setStartDate(LocalDate.now());
//        person.getBlock().setEndDate(LocalDate.now());
//
//        personRepository.save(person);
//        personRepository.findAll().forEach(System.out::println);
//
////        personRepository.delete(person);
////        personRepository.findAll().forEach(System.out::println);
////        blockRepository.findAll().forEach(System.out::println);
//
//        person.setBlock(null);
//        personRepository.save(person);
//        personRepository.findAll().forEach(System.out::println);
//        blockRepository.findAll().forEach(System.out::println);
//    }

    @Test
    void getPerson(){
//        givenPeople();

        Person person = personService.getPerson(3L);

//        System.out.println(person);
        assertThat(person.getName()).isEqualTo("dennis");
    }

    @Test
    void getPeopleByName(){
//        givenPeople();

        List<Person> result = personService.getPeopleByName("martin");

//        result.forEach(System.out::println);
        assertThat(result.size()).isEqualTo(1);
        assertThat(result.get(0).getName()).isEqualTo("martin");
    }

//    private void givenBlocks() {
//        givenBlock("martin");
//    }

//    private Block givenBlock(String name) {
//        return blockRepository.save(new Block(name));
//    }

    private void givenPeople() {
        givenPerson("martin", 10, "A");
        givenPerson("david", 9, "B");
        givenBlockPerson("dennis", 7, "O");
        givenBlockPerson("martin", 11, "AB");
    }

    private void givenPerson(String name, int age, String bloodType) {
        personRepository.save(new Person(name, age, bloodType));
    }

    private void givenBlockPerson(String name, int age, String bloodType){
        Person blockPerson = new Person(name, age, bloodType);
//        blockPerson.setBlock(givenBlock(name));
        blockPerson.setBlock(new Block(name));
        personRepository.save(blockPerson);
    }
}