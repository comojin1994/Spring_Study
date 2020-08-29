package com.fastcampus.javaallinone.project3.mycontect.service;

import com.fastcampus.javaallinone.project3.mycontect.controller.dto.PersonDto;
import com.fastcampus.javaallinone.project3.mycontect.domain.Block;
import com.fastcampus.javaallinone.project3.mycontect.domain.Person;
import com.fastcampus.javaallinone.project3.mycontect.domain.dto.Birthday;
import com.fastcampus.javaallinone.project3.mycontect.repository.BlockRepository;
import com.fastcampus.javaallinone.project3.mycontect.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class PersonService {
    @Autowired
    private PersonRepository personRepository;
//    @Autowired
//    private BlockRepository blockRepository;

    public List<Person> getPersonExcludeBlocks(){
//        List<Person> people = personRepository.findAll();
//        List<Block> blocks = blockRepository.findAll();
//        List<String> blockNames = blocks.stream().map(Block::getName).collect(Collectors.toList());

//        return people.stream().filter(person -> !blockNames.contains(person.getName())).collect(Collectors.toList());
//        return people.stream().filter(person -> person.getBlock() == null).collect(Collectors.toList());
        return personRepository.findByBlockIsNull();
    }

    @Transactional(readOnly = true)
    public Person getPerson(Long id){
//        Person person = personRepository.findById(id).get();

        Person person = personRepository.findById(id).orElse(null);

//        System.out.println("person : " + person);
        log.info("person : {}", person);

        return person;
    }

    public List<Person> getPeopleByName(String name){
//        List<Person> people = personRepository.findAll();
//
//        return people.stream().filter(person -> person.getName().equals(name)).collect(Collectors.toList());
        return personRepository.findByName(name);
    }

    @Transactional
    public void put(Person person){
        personRepository.save(person);
    }

    @Transactional
    public void modify(Long id, PersonDto personDto) {
        Person person = personRepository.findById(id).orElseThrow(() -> new RuntimeException("no id"));

        if (!person.getName().equals(personDto.getName())){
            throw new RuntimeException("Not same name");
        }

//        personAtDb.setName(personDto.getName());
//        personAtDb.setPhoneNumber(personDto.getPhoneNumber());
//        personAtDb.setJob(personDto.getJob());
//        if (personDto.getBirthday() != null){
//            personAtDb.setBirthday(new Birthday(personDto.getBirthday()));
//        }
//        personAtDb.setAddress(personDto.getAddress());
//        personAtDb.setBloodType(personDto.getBloodType());
//        personAtDb.setHobby(personDto.getHobby());
//        personAtDb.setAge(personDto.getAge());
        person.set(personDto);

        personRepository.save(person);
    }

    @Transactional
    public void modify(Long id, String name){
        Person person = personRepository.findById(id).orElseThrow(() -> new RuntimeException("no id"));

        person.setName(name);

        personRepository.save(person);
    }

    @Transactional
    public void delete(Long id) {
//        Person person = personRepository.findById(id).orElseThrow(() -> new RuntimeException("no id"));
//
//        personRepository.delete(person);
//        personRepository.deleteById(id);

        Person person = personRepository.findById(id).orElseThrow(() -> new RuntimeException("no id"));

        person.setDeleted(true);

        personRepository.save(person);
    }
}
