package seata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import seata.mapper.OrderMapper;

/**
 * @author rpf
 * @version 1.0
 * @date 2022/6/19 15:47
 */
@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    public void addOrder() {
        orderMapper.addOrder();
    }
}
