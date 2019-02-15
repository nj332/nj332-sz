package cn.itcast.core.dao.orderShop;

import cn.itcast.core.pojo.order.Order;
import cn.itcast.core.pojo.user.User;

public interface OrderShopDao {
    User selectByPrimaryKey(Integer id);
}
