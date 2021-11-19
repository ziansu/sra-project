private static void printOpenOrders(com.xeiam.xchange.service.polling.PollingTradeService tradeService) throws java.io.IOException, java.lang.InterruptedException {
    java.lang.Thread.sleep(1000);
    com.xeiam.xchange.dto.trade.OpenOrders openOrders = tradeService.getOpenOrders();
    java.lang.System.out.println(("Open Orders: " + (openOrders.toString())));
}