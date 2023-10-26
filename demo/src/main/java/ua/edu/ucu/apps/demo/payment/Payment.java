package ua.edu.ucu.apps.demo.payment;

import com.fasterxml.jackson.databind.util.ArrayBuilders.DoubleBuilder;

public interface Payment {
    double pay(double price);

}
