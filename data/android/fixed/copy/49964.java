@org.testng.annotations.Test
public void testAddNewCCForOrder() throws java.lang.Exception {
    init();
    uitestOperation.registerUser(userHybris);
    uitestOperation.addUserPaymentDetail(userHybris, billing);
    uitestOperation.buyManTshirtsWithAnonymousUser();
    uitestOperation.addCreditCardWhenCheckOut();
}