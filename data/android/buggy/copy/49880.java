public static void main(java.lang.String[] args) {
    try {
        com.fh.service.auto.WooApiGetOrdersService wooApiGetOrders = new com.fh.service.auto.WooApiGetOrdersService();
        wooApiGetOrders.getOrdersFromAnfa();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}