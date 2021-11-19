public static Order.OrderType BitMarketOrderTypeToOrderType(java.lang.String bitmarketOrderType) {
    return bitmarketOrderType.equals("buy") ? Order.OrderType.BID : Order.OrderType.ASK;
}