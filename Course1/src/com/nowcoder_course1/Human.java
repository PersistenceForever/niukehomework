package com.nowcoder_course1;

/**
 * Created by Administrator on 2017/5/8.
 */
public class Human extends Animal{
    private String country;
    public Human(String name,int age,String country){
        super(name, age);
        this.country=country;
    }

    @Override
    public void say() {
        System.out.println("This is "+getName()+" from "+country);
    }
}
