@org.junit.Test
public void testHasNext() {
    org.junit.Assert.assertTrue(Ipv6.FIRST_IPV6_ADDRESS.hasNext());
    org.junit.Assert.assertTrue(net.ripe.commons.ip.Ipv6.of("1:2:3:4:5:6:7:8").hasNext());
    org.junit.Assert.assertFalse(Ipv6.LAST_IPV6_ADDRESS.hasNext());
}