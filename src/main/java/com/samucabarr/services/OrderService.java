package com.samucabarr.services;

import com.samucabarr.entities.Order;

public class OrderService {
    private ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total(Order order) {
        double discount = order.getBasic() * order.getDiscount() / 100.0;
        double frete = shippingService.shipment(order);
        double value = order.getBasic() - discount + frete;
        return value;
    }
}
