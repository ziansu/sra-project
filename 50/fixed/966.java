@java.lang.Override
public int compare(com.brand.ushopping.model.OrderItem orderItem, com.brand.ushopping.model.OrderItem t1) {
    java.lang.Long reTime1 = orderItem.getReTime();
    java.lang.Long reTime2 = orderItem.getReTime();
    return reTime1.compareTo(reTime2);
}