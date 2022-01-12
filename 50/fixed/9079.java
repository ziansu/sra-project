public com.yuansewenhua.business.orders.model.OrderItem findOne(int orderId, long mid, com.yuansewenhua.api.business.bean.GoodsEnum type) {
    return com.yuansewenhua.business.orders.model.OrderItem.dao.findFirst("select * from orderitems t where t.orderid = ? and t.productid = ? and t.type = ?", orderId, mid, type.toString());
}