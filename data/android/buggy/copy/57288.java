@java.lang.Override
public table.ResultScanner getScanner(transaction.TransactionService tx, table.Scan scan) throws java.io.IOException {
    return table.getScanner(((hbase.Transaction) (tx)), scan);
}