package ua.edu.ucu.apps.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;

import ua.edu.ucu.apps.demo.delivery.PostDeliveryStrategy;
import ua.edu.ucu.apps.demo.flowers.Flower;
import ua.edu.ucu.apps.demo.flowers.FlowerColor;
import ua.edu.ucu.apps.demo.flowers.Item;
import ua.edu.ucu.apps.demo.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.demo.delivery.Delivery;

public class DeliverTets {

    private PostDeliveryStrategy postDelivery;
    private DHLDeliveryStrategy dhlDelivery;
    private List<Item> order;

    @BeforeEach
    public void init() {
        dhlDelivery = new DHLDeliveryStrategy();
        postDelivery = new PostDeliveryStrategy();
        order = List.of(new Flower(45, 0.8, FlowerColor.RED), new Flower(456, 0.8, FlowerColor.RED));

    }

    @Test
    public void testDHLDelivery() {
        assertEquals(order, dhlDelivery.deliver(order));
    }

    @Test
    public void testPostDelivery() {
        assertEquals(order, postDelivery.deliver(order));
    }
}
