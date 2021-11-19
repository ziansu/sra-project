@org.junit.Test
public void testMain() {
    java.lang.String[] args = new java.lang.String[]{  };
    com.iluwatar.monostate.App.main(args);
    org.junit.Assert.assertTrue(((com.iluwatar.monostate.LoadBalancer.getLastServedId()) == 2));
}