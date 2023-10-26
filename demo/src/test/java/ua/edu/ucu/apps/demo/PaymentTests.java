package ua.edu.ucu.apps.demo;

import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.demo.payment.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.demo.payment.PayPalPaymentStrategy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

class PaymentTests {
    private PayPalPaymentStrategy payPalPayment;
    private CreditCardPaymentStrategy creditCardPayment;
    private double price;

    @BeforeEach
    public void init() {
        payPalPayment = new PayPalPaymentStrategy();
        creditCardPayment = new CreditCardPaymentStrategy();
        price = 100.0;

    }

    @Test
    public void testCreditCard() {
        assertEquals(price, creditCardPayment.pay(price));
    }

    @Test
    public void testPayPal() {
        assertEquals(price, payPalPayment.pay(price));
    }
}