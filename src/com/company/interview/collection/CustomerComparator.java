package com.company.interview.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Description TODO
 * @Author 计算机171 戴启东
 * @Date 2020/9/15 22:20
 */
public class CustomerComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer c1, Customer c2) {
        if(c1.getName().compareTo(c2.getName())>0) return -1;
        if(c1.getName().compareTo(c2.getName())<0) return 1;
        return 0;
    }

    public static void main(String[] args) {
        Set<Customer> set = new TreeSet<>(new CustomerComparator());
        Customer customer1 = new Customer("Tom",13);
        Customer customer2 = new Customer("Tom",44);
        Customer customer3 = new Customer("Tom",4);
        set.add(customer1);
        set.add(customer2);
        set.add(customer3);
        Iterator<Customer> it = set.iterator();
        while(it.hasNext()){
            Customer customer = it.next();
            System.out.println(customer.getName() + " " + customer.getAge());

        }


    }
}
