package com.samucabarr.services;

import com.samucabarr.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        double freight = 0.0;
        if (order.getBasic() < 100.0) {
            freight = 20.0;
        } else if (order.getBasic() >= 100.0 && order.getBasic() <= 200.0) {
            freight = 12.0;
        }
        return freight;
    }
}
