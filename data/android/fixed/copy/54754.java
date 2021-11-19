private void verifyInstance(com.cisco.oss.foundation.directory.entity.ServiceInstance instance) {
    org.junit.Assert.assertEquals("foo", instance.getServiceName());
    org.junit.Assert.assertEquals("192.168.1.1", instance.getAddress());
}