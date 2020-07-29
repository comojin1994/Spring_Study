package polymorphism;

import java.util.ArrayList;

class Animal {

    public void move() {
        System.out.println("Animal is moving.");
    }
}

class Human extends Animal {
    @Override
    public void move() {
        System.out.println("Human is moving.");
    }

    public void readBooks() {
        System.out.println("Human read books.");
    }
}

class Tiger extends Animal {
    @Override
    public void move() {
        System.out.println("Tiger is moving.");
    }

    public void hunting() {
        System.out.println("Tiger is hunting.");
    }
}

class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("Eagle is flying.");
    }

    public void flying() {
        System.out.println("Eagle is strictly flying.");
    }
}

public class AnimalTest {
    public static void main(String[] args) {

        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

//        Eagle human = (Eagle)hAnimal;
        if (hAnimal instanceof Human) {
            Human human = (Human) hAnimal;
            human.readBooks();
        }

        AnimalTest test = new AnimalTest();
//        test.moveAnimal(hAnimal);
//        test.moveAnimal(tAnimal);
//        test.moveAnimal(eAnimal);

        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        test.testDownCasting(animalList);

//        for(Animal animal : animalList){
//            animal.move();
//        }
    }

    public void testDownCasting(ArrayList<Animal> list) {
        for (int i = 0; i < list.size(); i++) {
            Animal animal = list.get(i);
            if (animal instanceof Human) {
                Human human = (Human) animal;
                human.readBooks();
            } else if (animal instanceof Tiger) {
                Tiger tiger = (Tiger) animal;
                tiger.hunting();
            } else if (animal instanceof Eagle) {
                Eagle eagle = (Eagle) animal;
                eagle.flying();
            } else {
                System.out.println("Error");
            }
        }
    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }

//    public void moveAnimal(Human animal){
//        animal.move();
//    }
//    이렇게 만드려면 자료형 하나당 하나의 메서드를 구현해야함
}
