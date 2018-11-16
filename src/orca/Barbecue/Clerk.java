package orca.Barbecue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Clerk {

    private List<Order> orders = new ArrayList<>();
    private Iterator<Order> iterator = orders.iterator();

    public Clerk(){
//        this.chef = chef;
    }

    public void addOrder(Order order){
        orders.add(order);
    }

    public void removeOrder(Order order){
        orders.remove(order);
    }


    public void invoke(){
        System.out.println("invoke");
        for (Order o :
                orders) {
            o.execute();
        }
    }


}
