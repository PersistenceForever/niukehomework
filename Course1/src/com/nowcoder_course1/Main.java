package com.nowcoder_course1;
import java.text.*;
import java.util.*;
/**
 * Created by Administrator on 2017/5/8.
 */
public class Main {

    /**
     * 打印对象
     * @param index
     * @param obj
     */
    public static void print(int index, Object obj) {
        System.out.println(String.format("{%d},%s", index, obj.toString()));
    }
     public  static void commonData(){
         Random random=new Random();
         random.setSeed(100);
         for (int i = 0; i <4 ; i++) {
           print(1,random.nextInt(100));
           print(2,random.nextDouble());
         }
         List<Integer> array= Arrays.asList(new Integer[]{1,2,3,4,5});
         print(3,array);
         Collections.shuffle(array);
         print(4,array);
         Date date=new Date();
         print(5,date);
         print(6,date.getTime());
         DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
         print(7,df.format(date));
         print(8,DateFormat.getDateInstance(DateFormat.FULL).format(date));
         print(9,UUID.randomUUID());
         print(10,Math.floor(2.5));
         print(11,Math.ceil(2.5));
         print(12,Math.log(2.71));
         print(13,Math.max(3,5));
     }
     public static void demoClass(){
         Animal animal=new Animal("Tom",10);
         animal.say();
         Animal human=new Human("Li",15,"CN");
         human.say();
     }
    public static void main(String[] args) {
        System.out.println("hello world!");
        print(1,5<<2);
        print(2,24>>2);
        commonData();
        demoClass();
    }
}
