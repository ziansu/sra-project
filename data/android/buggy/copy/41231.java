public java.lang.String getBalance() {
    org.bitcoinj.core.Coin balance = wallet.getBalance();
    return balance.toFriendlyString();
}