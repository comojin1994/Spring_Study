package coorperationExample;

public class Person {
    private String personName;
    private int age;
    private int money;

    public Person(String name, int age, int money){
        setPersonName(name);
        setAge(age);
        setMoney(money);
    }

    public void takeStar(int menu){
        setMoney(this.money - menu);
    }

    public void takeBean(int menu){
        setMoney(this.money - menu);
    }

    public void showInfo(){
        System.out.println(personName + " has " + money);
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

}
