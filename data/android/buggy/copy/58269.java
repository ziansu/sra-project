@org.springframework.transaction.annotation.Transactional
public mycai.pojo.User getUserByWechatId(java.lang.String fromUserName) {
    mycai.pojo.User user = userDao.getUserByWechatId(fromUserName);
    java.util.List<mycai.pojo.Order> orderList = orderDao.getList(user.getOpenid());
    user.setOrderList(orderList);
    return user;
}