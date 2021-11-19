@org.testng.annotations.Test
public void testAddNewCCForOrder() throws java.lang.Exception {
    uitestOperation.registerUser(userHybris);
    uitestOperation.addUserPaymentDetail(userHybris, billing);
    uitestOperation.buyManTshirtsWithAnonymousUser();
    uitestOperation.addCreditCardWhenCheckOut();
}