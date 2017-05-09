package com.nowcoder_course1;

import java.util.*;

/**
 * Created by Administrator on 2017/5/8.
 */
public class Course1_ZuoYe1 {
    public static void main(String[] args) {
        //1、 Random相关成员函数的使用
        Random r=new Random();
        int n1;
        for (int i = 0; i < 3; i++) {
            n1=r.nextInt(100);
            System.out.print(n1+" ");
        }
        System.out.println();
        System.out.println("*********");
        r.setSeed(10);
        for (int i = 0; i < 3; i++) {
            n1=r.nextInt(100);
            System.out.print(n1+" ");
        }
        System.out.println();
        //2、Math相关成员函数的使用
        double n2=-3.5;
        double n3=Math.abs(n2);
        double n4=Math.ceil(n3);
        double n5=Math.floor(n3);
        System.out.println("n3:"+n3);
        System.out.println("n4:"+n4);
        System.out.println("n5:"+n5);
        //3、String相关成员函数的使用
        String s1="Welcome to Beijing!";
        String s2=s1.toLowerCase();
        System.out.println(s2);
        String[] str=s2.split(" ");
        for (String string : str) {
            System.out.println(string+" ");
        }
        //4、ArrayList相关成员函数的使用
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            arr.add(i+10);
        }
        Object[] obj=arr.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.print(obj[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        //5、Set相关成员函数的使用
        Set<String> set=new HashSet<String>();
        set.add("abc");
        set.add("def");
        set.add("ghi");
        set.add("abc");//相同的abc，set将会自动去掉
        System.out.println("size="+set.size());
        Iterator<String> it=set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        set.clear();//将元素全部删除
        System.out.println(set.size());
        //6、HashMap相关成员函数的使用
        HashMap<Integer, String> hm=new HashMap<Integer, String>();
        hm.put(1,"语文");
        hm.put(2,"数学");
        hm.put(3,"英语");
        hm.put(3,"语文");//键相同时会覆盖
        System.out.println("size:"+hm.size());
        Set<Map.Entry<Integer, String>> set1=hm.entrySet();
        Iterator<Map.Entry<Integer, String>> it1=set1.iterator();
        while(it1.hasNext())
        {
            Map.Entry<Integer, String> map1=it1.next();
            Integer integer=map1.getKey();
            String str1=map1.getValue();
            System.out.println(integer+","+str1);
        }
    }
}
