public org.bitcoinj.core.Coin getBalance() {
    org.bitcoinj.core.Coin balance = wallet.getBalance();
    return balance;
}