package com.pf.seata.controller;

import com.pf.seata.service.StockService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rpf
 * @version 1.0
 * @date 2022/6/19 14:20
 */
@RequestMapping(value = "/stock")
@RestController(value = "库存模块")
public class StockController {

    @Autowired
    private StockService stockService;

    @PostMapping(value = "/decrStock")
    public void decrStock() {
        stockService.decrStock();
    }
}
