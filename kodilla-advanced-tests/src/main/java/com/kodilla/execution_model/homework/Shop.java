package com.kodilla.execution_model.homework;

import com.kodilla.execution_model.Item;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Shop {
    private List<Order> clientOrders = new ArrayList<>();


    public void addOrder(Order order) {
        this.clientOrders.add(order);
    }

    public List<Order> getClientOrders() {
        return clientOrders;
    }

    public List<Order> getOrderBetweenDates(LocalDate dateFirst, LocalDate dateSecond) {
        List<Order> ordersBetweenDate = new ArrayList<>();
        for (Order order : clientOrders) {
            if (!order.getOrderDate().isBefore(dateFirst) && !order.getOrderDate().isAfter(dateSecond)) {
                ordersBetweenDate.add(order);
            }
        }
        return ordersBetweenDate;
    }
    public List<Order> getBetweenValuesOrders(double lowValue, double highValue){
        List<Order> ordersBetweenValues = new ArrayList<>();
        for (Order order : clientOrders)
            if (lowValue <= order.getOrderValue() && order.getOrderValue()<=highValue)  {
                ordersBetweenValues.add(order);
            }
        return ordersBetweenValues;
    }
    public int numOfOrders() {
        int count = 0;
        for (Order order : clientOrders){
        count++;
    }
        return count;
    }
    public double ordersValue(){
        double sumOfValues = clientOrders.stream().mapToDouble(n->n.getOrderValue()).sum();
        return sumOfValues;
    }

}