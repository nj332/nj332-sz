package cn.itcast.core.service.orderShop;

import cn.itcast.core.pojo.order.Order;
import cn.itcast.core.pojo.user.User;

import java.util.List;

public interface OrderShopService {
    public List<Order> findUserByUserId(String sellerId,String userId);
}
