package cn.itcast.core.service.orderCount;

import cn.itcast.core.pojo.order.OrderItem;

import java.util.List;

public interface OrderCountService {
    public List<OrderItem> findAllOrderItemByOrderIdAndSellerId(Long OrderId,String SellerId);
}
