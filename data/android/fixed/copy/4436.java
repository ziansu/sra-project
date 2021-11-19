@org.junit.Test
public void testHundredCustomers() {
    for (int i = 0; i < 100; i++) {
        this.hierarchicalInfileObjectLoader.persist(com.opower.persistence.jpile.sample.ObjectFactory.newCustomer());
    }
}