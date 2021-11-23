@java.lang.Override
public void withdraw(double x) throws com.luxoft.training.javase.bankapp.domains.accounts.NotEnoughFundsException {
    if ((x >= 0) && (x <= (availableFunds())))
        accountModified(balance, (balance -= x));
    else
        throw new com.luxoft.training.javase.bankapp.domains.accounts.NotEnoughFundsException(x);
    
}