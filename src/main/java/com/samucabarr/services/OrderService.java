package com.samucabarr.services;

import com.samucabarr.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
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
