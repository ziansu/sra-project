@org.junit.Test
public void testGetManager() {
    br.com.singularideas.labs.knowhub.client.aboriginal.ProtectManager pm = protectManagerService.getManager();
    org.junit.Assert.assertNotNull(pm);
}