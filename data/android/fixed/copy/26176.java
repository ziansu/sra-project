@org.junit.Test(expected = javax.naming.ConfigurationException.class)
public void testFailedParams() throws javax.naming.ConfigurationException {
    java.util.HashMap<java.lang.String, java.lang.Object> par = new java.util.HashMap<java.lang.String, java.lang.Object>(com.cloud.hypervisor.ovm3.resources.helpers.Ovm3ConfigurationTest.params);
    par.put("pod", null);
    ovm3config = new com.cloud.hypervisor.ovm3.resources.helpers.Ovm3Configuration(par);
}