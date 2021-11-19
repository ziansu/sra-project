public java.lang.Object handle() {
    java.lang.String result = request(url);
    com.adintellig.ella.hbase.handler.JMXRegionServerHandler.logger.info(("Request URL: " + (url)));
    return parseBean(result);
}