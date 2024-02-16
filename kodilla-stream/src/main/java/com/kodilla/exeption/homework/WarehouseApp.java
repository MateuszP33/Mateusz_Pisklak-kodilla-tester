package com.kodilla.exeption.homework;

import java.util.ArrayList;
import java.util.List;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("order1"));
        warehouse.addOrder(new Order("order2"));
        warehouse.addOrder(new Order("order3"));
        warehouse.addOrder(new Order("order4"));
        warehouse.addOrder(new Order("order5"));
        try {
            warehouse.getOrder("oreder7");
        } catch (OrderDoesntExistException e) {
            System.out.println("Wrong number, try again");
        }
    }
}
