@org.junit.Test(expected = banksys.account.exception.NegativeAmountException.class)
public void testDebitNegative() throws banksys.account.exception.InsufficientFundsException, banksys.account.exception.NegativeAmountException {
    ac = new banksys.account.OrdinaryAccount("01");
    ac.debit((-100));
}