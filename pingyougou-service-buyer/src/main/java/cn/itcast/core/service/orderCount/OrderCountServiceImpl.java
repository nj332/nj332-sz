package cn.itcast.core.service.orderCount;

import cn.itcast.core.dao.order.OrderItemDao;
import cn.itcast.core.pojo.order.OrderItem;
import cn.itcast.core.pojo.order.OrderItemQuery;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class OrderCountServiceImpl implements OrderCountService {
    @Resource
    OrderItemDao orderItemDao;
    @Override
    public List<OrderItem> findAllOrderItemByOrderIdAndSellerId(Long OrderId, String SellerId) {
        OrderItemQuery orderItemQuery = new OrderItemQuery();
        OrderItemQuery.Criteria criteria = orderItemQuery.createCriteria();
        criteria.andOrderIdEqualTo(OrderId);
        criteria.andSellerIdEqualTo(SellerId);
        List<OrderItem> orderItemList = orderItemDao.selectByExample(orderItemQuery);
        return orderItemList;

    }
}
