package com.pf.seata.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author rpf
 * @version 1.0
 * @date 2022/6/19 16:30
 */
@Component
@FeignClient(name = "order", url = "localhost:18082/order")
public interface OrderService {

    @PostMapping(value = "/addOrder")
    void addOrder();
}
