package cn.itcast.core.controller.orderShop;

import cn.itcast.core.pojo.order.Order;
import cn.itcast.core.service.orderShop.OrderShopService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orderShop")
public class OrderShopController {
    @Reference
    private OrderShopService orderShopService;
    @RequestMapping("/user.do")
    public List<Order> findUserByUserId(String sellerId,String userId){
        //String name = SecurityContextHolder.getContext().getAuthentication().getName();
        List<Order> orderShopLists = orderShopService.findUserByUserId(sellerId,userId);
        System.out.println(orderShopLists.toString());
        /*List<Order> Lists = orderShopService.findUserByUserId(order);

        System.out.println(Lists);
        return Lists;*/
        return orderShopLists;
    }
}
