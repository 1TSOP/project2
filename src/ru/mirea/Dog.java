package ru.mirea;
import java.lang.*;
public class Dog {
    private String name;
    private int age;
    public Dog(String n, int a){
        name = n;
        age = a;
    }
    public Dog(String n){
        name = n;
        age = 0;
    }
    public Dog(){
        name = "Dog";
        age = 0;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void HumanAge() {
        System.out.println("Dog{" +
                "name='" + name + '\'' +
                ",human age=" + age*7 +
                '}');
    }
}
