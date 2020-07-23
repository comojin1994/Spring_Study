package kr.co.fastcampus.eatgo.domain;

public class Restaurant {

    private final String name;

    private final String address;

    public Restaurant(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getInformation() {
        return this.name + " in " + this.address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
