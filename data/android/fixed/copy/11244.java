private static long getCryptoTransactionFee(org.bitcoinj.core.Transaction transaction) {
    return (transaction.getFee()) == null ? 0 : transaction.getFee().getValue();
}