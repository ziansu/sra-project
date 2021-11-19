@org.junit.After
public void deleteWallet() throws java.lang.Exception {
    this.wallet.closeWallet();
    org.hyperledger.indy.sdk.wallet.Wallet.deleteWallet(walletName, null);
}