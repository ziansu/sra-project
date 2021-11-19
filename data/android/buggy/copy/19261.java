public static com.kantilever.t1c3android.domain.OrderState findOrderState(java.lang.String name) {
    com.kantilever.t1c3android.domain.OrderState state = null;
    for (com.kantilever.t1c3android.domain.OrderState orderState : com.kantilever.t1c3android.domain.OrderState.values())
        if (orderState.name.equals(name))
            state = orderState;
        
    
    return state;
}