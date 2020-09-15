package com.company.interview.topic;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Animal{
    public void move(){
        System.out.println("the animal is moving");
    }
}

class Dog extends Animal{
    @Override
    public void move(){
        System.out.println("the dog can run");
    }
    public void bark(){
        System.out.println("the dog can bark");
    }
}

public class TestDog{
    public static void main(String args[]){
        Integer integ =new Integer(9);
        boolean b = integ  instanceof  Object;
        System.out.println(b);
        TestDog testDog = new TestDog();
        testDog.method();

        List<Integer> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();

    }



    public void method(){
        // 通过反射得到T的真实类型
        ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
        Object t = (Class) pt.getActualTypeArguments()[0];//取第一个泛型的类型
        System.out.println(((Class) t).getName());

    }
}