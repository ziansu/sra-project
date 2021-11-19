public long getTransactionAvg(int i) {
    if ((i > 49) || (i < 0))
        return 0;
    else
        return transactionAvg.get(i);
    
}