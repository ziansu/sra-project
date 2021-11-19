public org.bitcoinj.utils.Fiat getBalanceFiat() {
    return this.exchangeRate.coinToFiat(getBalance());
}