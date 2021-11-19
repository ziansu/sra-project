@java.lang.Override
public com.mfolivas.atlas.controller.GeoLocationResponse extractIpInformation(com.mfolivas.atlas.domain.IpRequest ipRequest) throws java.lang.Exception {
    com.netflix.hystrix.strategy.concurrency.HystrixRequestContext context = com.netflix.hystrix.strategy.concurrency.HystrixRequestContext.initializeContext();
    com.mfolivas.atlas.ipinfo.IpInfoGeoLocationCommand ipInfoGeoLocationCommand = new com.mfolivas.atlas.ipinfo.IpInfoGeoLocationCommand(ipInfoConfiguration, ipRequest);
    context.shutdown();
    return ipInfoGeoLocationCommand.run();
}