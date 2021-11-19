@org.junit.Test
public void testfindUserByIDWithNull() {
    Bank bnk = new Bank();
    bnk.withCustomerUser(null);
    User usrGet = bnk.findUserByID("steverog1");
    assertTrue((usrGet == null));
}