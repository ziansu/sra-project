@java.lang.Override
public int compare(com.brand.ushopping.model.OrderItem orderItem, com.brand.ushopping.model.OrderItem t1) {
    long reTime1 = orderItem.getReTime();
    long reTime2 = orderItem.getReTime();
    if (reTime1 < reTime2) {
        return 1;
    }else {
        return -1;
    }
}