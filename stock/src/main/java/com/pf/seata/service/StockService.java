package com.pf.seata.service;

import com.pf.seata.mapper.StockMapper;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author rpf
 * @version 1.0
 * @date 2022/6/19 15:47
 */
@Service
public class StockService {

    @Autowired
    private StockMapper stockMapper;
    @Autowired
    private OrderService orderService;

    @GlobalTransactional
    public void decrStock() {
        stockMapper.decrStock();
        orderService.addOrder();
    }
}
