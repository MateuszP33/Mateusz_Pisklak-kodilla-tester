package com.kodilla.exeption.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {
    @Test
    public void testGetOrder_throwException(){
        Warehouse warehouse = new Warehouse();

        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("order7"));
    }

}