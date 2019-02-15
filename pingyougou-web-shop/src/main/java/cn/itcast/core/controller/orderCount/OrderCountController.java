package cn.itcast.core.controller.orderCount;

import cn.itcast.core.pojo.order.OrderItem;
import cn.itcast.core.service.orderCount.OrderCountService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orderCount")
public class OrderCountController {
    @Reference
    OrderCountService orderCountService;
    @RequestMapping("/user.do")
    public List<OrderItem> findAllOrderItemByOrderIdAndSellerId(Long OrderId, String SellerId){
        List<OrderItem> Lists = orderCountService.findAllOrderItemByOrderIdAndSellerId(OrderId, SellerId);
        System.out.println(Lists);
        return Lists;
    }
}
