package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {
    Shop clientOrders = new Shop();
    Order order1 = new Order(35.5, LocalDate.of(2024, 02, 24), "login1");
    Order order2 = new Order(15.5, LocalDate.of(2024, 01, 15), "login2");
    Order order3 = new Order(25.5, LocalDate.of(2024, 03, 22), "login3");
    Order order4 = new Order(45.5, LocalDate.of(2024, 03, 01), "login4");
    Order order5 = new Order(105.5, LocalDate.of(2024, 03, 31), "login5");

    @BeforeEach
    public void addOrders() {
        clientOrders.addOrder(order1);
        clientOrders.addOrder(order2);
        clientOrders.addOrder(order3);
        clientOrders.addOrder(order4);
        clientOrders.addOrder(order5);
    }

    @Test
    public void shouldAddOrdersAndReturnNumberOfOrders() {
        assertEquals(5, clientOrders.numOfOrders());
    }
    @Test
    public void shouldReturnRightInfo() {
        assertEquals(LocalDate.of(2024,03,22), clientOrders.getClientOrders().get(2).getOrderDate());
        assertEquals(105.5, clientOrders.getClientOrders().get(4).getOrderValue());
        assertEquals("login1", clientOrders.getClientOrders().get(0).getLogin());
    }
    @Test
    public void shouldReturnListOfOrdersBetweenDates(){
        List<Order>result = clientOrders.getOrderBetweenDates(LocalDate.of(2024,02,24),LocalDate.of(2024, 03, 22));
        List<Order> expected = new ArrayList<>();
        expected.add(order1);
        expected.add(order3);
        expected.add(order4);
        assertEquals(expected, result);
    }
    @Test
    public void shouldReturnEmptyListOfOrdersBetweenDates() {
        List<Order> result = clientOrders.getOrderBetweenDates(LocalDate.of(2024, 04, 24), LocalDate.of(2024, 06, 22));
        List<Order> expected = new ArrayList<>();
        assertEquals(expected, result);
    }
    @Test
    public void shouldReturnListOfOrdersBetweenValues(){
        List<Order>result = clientOrders.getBetweenValuesOrders(15.5,45.5);
        List<Order> expected = new ArrayList<>();
        expected.add(order1);
        expected.add(order2);
        expected.add(order3);
        expected.add(order4);
        assertEquals(expected, result);
    }
    @Test
    public void shouldReturnEmptyListOfOrdersBetweenValues(){
        List<Order>result = clientOrders.getBetweenValuesOrders(105.6,145.5);
        List<Order> expected = new ArrayList<>();
        assertEquals(expected, result);
    }
    @Test
    public void shouldReturnNumberOfOrders(){
        int result = clientOrders.numOfOrders();
        assertEquals(5, result);
    }
    @Test
    public void shouldReturnSumOfValues(){
        double result = clientOrders.ordersValue();
        assertEquals(227.5, result);
    }

}