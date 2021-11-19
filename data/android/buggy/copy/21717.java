public static java.lang.String getDepth(java.lang.String symbol) throws java.lang.Exception {
    return com.binance.BinanceAPI.sendGet((((com.binance.BinanceAPI.BASE_URL) + "/api/v1/depth?symbol=") + symbol));
}