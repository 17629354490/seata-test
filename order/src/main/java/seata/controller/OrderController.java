package seata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import seata.service.OrderService;

/**
 * @author rpf
 * @version 1.0
 * @date 2022/6/19 14:20
 */
@RequestMapping(value = "/order")
@RestController(value = "订单模块")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping(value = "/addOrder")
    public void addOrder() {
        orderService.addOrder();
    }
}
