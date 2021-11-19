@java.lang.Override
public com.parse.ParseQuery<com.adamnickle.delivering.Delivery> getQuery() {
    return com.adamnickle.delivering.Delivery.createQuery().whereEqualTo(Delivery.DELIVERER, com.adamnickle.delivering.DeliveringUser.getCurrentUser()).addDescendingOrder(Delivery.CREATED_AT);
}