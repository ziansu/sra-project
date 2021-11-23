@java.lang.Override
public void withdraw(float x) throws com.luxoft.bankapp.exception.NotEnoughFundsException {
    if (x > (balance)) {
        throw new com.luxoft.bankapp.exception.NotEnoughFundsException((x - (balance)));
    }else {
        float b = (balance) - x;
        balance = b;
    }
}