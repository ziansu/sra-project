private static long getCryptoTransactionFee(org.bitcoinj.core.Transaction transaction) {
    return transaction.getFee().getValue();
}