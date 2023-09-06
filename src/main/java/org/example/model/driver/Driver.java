package org.example.model.driver;

public class Driver {
    private String name;
    private int age;
    private double experience;

    public Driver(){
        this.name = "Speedy Gonzales";
        this.age = 30;
        this.experience = 1;
    }

    public Driver(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                '}';
    }

    public double getPowerRace(){
        double tmp = this.experience;
        this.experience += 10;
        return tmp - this.age / 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
