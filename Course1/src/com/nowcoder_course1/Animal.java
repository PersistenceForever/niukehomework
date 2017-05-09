package com.nowcoder_course1;

/**
 * Created by Administrator on 2017/5/8.
 */
public class Animal implements Talking {
    private String name;
    private  int age;
    Animal(String name,int age){
        this.name=name;
        this.age=age;
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

    @Override
    public void say() {
        System.out.println("This is animal");
    }
}
