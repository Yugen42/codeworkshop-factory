package de.conrad.codeworkshop.factory.services.order;

import de.conrad.codeworkshop.factory.services.order.api.Order;
import de.conrad.codeworkshop.factory.services.order.api.OrderConfirmation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Andreas Hartmann
 */
@RestController("orderController")
@RequestMapping("/order")
public class Controller {

    private final Service factoryService;

    @Autowired
    public Controller(final Service service) {
        this.factoryService = service;
    }

    @PostMapping("/create")
    public OrderConfirmation createOrder(final Order order) {
        return factoryService.createOrder(order);
    }
}