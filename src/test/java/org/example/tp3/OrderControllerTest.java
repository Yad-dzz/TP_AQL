package org.example.tp3;


import org.example.tp3.order.Order;
import org.example.tp3.user.User;

import org.example.tp3.order.OrderController;
import org.example.tp3.order.OrderService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

public class OrderControllerTest {
    @Mock
    private OrderService orderService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testCreateOrder() {

        Order testOrder = new Order(1234, "RIFKUS", 10, 60.50);

        OrderController orderController = new OrderController(orderService);

        orderController.createOrder(testOrder);

        verify(orderService).createOrder(testOrder);
    }
}