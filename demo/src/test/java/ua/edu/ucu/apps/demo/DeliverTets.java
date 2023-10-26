package ua.edu.ucu.apps.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import ua.edu.ucu.apps.demo.delivery.PostDeliveryStrategy;
import ua.edu.ucu.apps.demo.flowers.Flower;
import ua.edu.ucu.apps.demo.flowers.FlowerColor;
import ua.edu.ucu.apps.demo.flowers.Item;
import ua.edu.ucu.apps.demo.delivery.DHLDeliveryStrategy;

public class DeliverTets {
    private PostDeliveryStrategy postDelivery;
    private DHLDeliveryStrategy dhlDelivery;
    private List<Item> order;
    private final double price = 100;

    @BeforeEach
    public void init() {
        dhlDelivery = new DHLDeliveryStrategy();
        postDelivery = new PostDeliveryStrategy();
        order = List.of(new Flower(price, 0.8, FlowerColor.RED), new Flower(price, 0.8, FlowerColor.RED));
    }

    @Test
    public void testDHLDelivery() {
        Assertions.assertEquals(order, dhlDelivery.deliver(order));
    }

    @Test
    public void testPostDelivery() {
        Assertions.assertEquals(order, postDelivery.deliver(order));
    }
}
