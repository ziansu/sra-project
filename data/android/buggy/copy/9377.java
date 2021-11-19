@org.junit.Test
public void testConversionToEureka1xDataCenterInfo() throws java.lang.Exception {
    com.netflix.eureka2.registry.datacenter.AwsDataCenterInfo v2DataCenterInfo = SampleAwsDataCenterInfo.UsEast1a.build();
    com.netflix.appinfo.AmazonInfo v1DataCenterInfo = com.netflix.eureka2.eureka1.utils.Eureka1ModelConverters.toEureka1xDataCenterInfo(v2DataCenterInfo);
    com.netflix.eureka2.eureka1.utils.Eureka1ModelConvertersTest.verifyDataCenterInfoMapping(v1DataCenterInfo, v2DataCenterInfo);
}