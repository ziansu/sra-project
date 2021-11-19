@org.junit.Test
public void testDebitNegative() throws banksys.account.exception.InsufficientFundsException, banksys.account.exception.NegativeAmountException {
    ac = new banksys.account.OrdinaryAccount("01");
    try {
        ac.debit((-100));
    } catch (banksys.account.exception.NegativeAmountException e) {
        assertEquals(1, 1, 0);
    }
}