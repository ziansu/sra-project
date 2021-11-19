@org.junit.Test(expected = NoCashException.class)
public void getEmptyCashMachine() throws java.lang.Exception {
    final CashMachine cashMachine = new CashMachine(CashMachineTest.DENOMINATIONS);
    cashMachine.get(1);
}