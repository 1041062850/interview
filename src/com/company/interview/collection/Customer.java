package com.company.interview.collection;

import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Description TODO
 * @Author 计算机171 戴启东
 * @Date 2020/9/15 21:17
 */
public class Customer implements Comparable, Serializable {

    private String name;
    private int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
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

/*    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(!(obj instanceof Customer))
            return false;
        final Customer other = (Customer) obj;

        if(this.name.equals(other.getName()) && this.age == other.getAge())
            return true;
        else
            return false;
    }*/

/*
    @Override
    public int hashCode() {
        int result;
        result = (name == null ? 0 : name.hashCode());
        result = 29 * result + age;
        return result;
    }
*/

    @Override
    public int compareTo(Object o) {
        Customer other = (Customer) o;

        //name排序
        if(this.name.compareTo(other.getName()) > 0)
            return 1;
        if(this.name.compareTo(other.getName()) < 0)
            return -1;

        if(this.age > other.getAge())
            return 1;
        if(this.age < other.getAge())
            return -1;

        return 0;
    }

    public static void main(String[] args) {
        Set<Customer> set = new TreeSet<Customer>();
        Customer customer1 = new Customer("Tom",1);
        Customer customer2 = new Customer("Tom",2);
        Customer customer3 = new Customer("To",3);
        Customer customer4 = new Customer("T",4);


        set.add(customer1);
        set.add(customer2);
        set.add(customer4);
        set.add(customer3);
        System.out.println(set);

        for (Customer c:set
             ) {
            System.out.println(c.name + " " + c.age);
        }



    }
}
