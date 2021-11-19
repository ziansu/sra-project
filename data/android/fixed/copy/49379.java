@java.lang.Override
public boolean update(java.lang.Long id, com.restbucks.domain.Order order) {
    orders.put(id, order);
    return false;
}