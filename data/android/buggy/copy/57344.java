private void processOrderMessage(final com.jforex.programming.order.OrderUpdateEventData orderUpdateEventData, final com.jforex.programming.order.OrderUpdateEvent orderUpdateEvent) {
    if (orderUpdateEventHandlers.containsKey(orderUpdateEvent)) {
        printOrderUpdate(orderUpdateEventData);
        orderUpdateEventHandlers.get(orderUpdateEvent).run();
    }else
        printUnexpectedOrderUpdate(orderUpdateEventData);
    
}