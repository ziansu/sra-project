public com.m2049r.xmrwallet.model.Wallet openWallet(java.lang.String path, java.lang.String password) {
    long walletHandle = openWalletJ(path, password, isTestNet());
    com.m2049r.xmrwallet.model.Wallet wallet = new com.m2049r.xmrwallet.model.Wallet(walletHandle);
    manageWallet(wallet);
    return wallet;
}