package cn.itcast.core.service.orderShop;

import cn.itcast.core.dao.order.OrderDao;
import cn.itcast.core.dao.order.OrderItemDao;
import cn.itcast.core.dao.orderShop.OrderShopDao;
import cn.itcast.core.dao.user.UserDao;
import cn.itcast.core.pojo.order.Order;
import cn.itcast.core.pojo.order.OrderItem;
import cn.itcast.core.pojo.order.OrderQuery;
import cn.itcast.core.pojo.user.User;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderShopServiceImpl implements OrderShopService {
    @Resource
    UserDao userDao;
    @Resource
    OrderDao orderDao;
    @Resource
    OrderItemDao orderItemDao;
    @Override
    public List<Order> findUserByUserId(String sellerId,String userId) {
        OrderQuery query = new OrderQuery();
        OrderQuery.Criteria criteria = query.createCriteria();
        criteria.andSellerIdEqualTo(sellerId.toString());
        criteria.andUserIdEqualTo(userId.toString());
        //商家获取客户的订单项集合
        List<Order> orders = orderDao.selectByExample(query);
        /*遍历订单项集合
        for (Order order : orders) {
            //获取订单id
            Long orderId = order.getOrderId();

            //查询
            OrderItem orderItem = orderItemDao.selectByPrimaryKey(orderId);

        }*/

        return orders;
    }
}
