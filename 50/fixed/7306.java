public java.util.List<generated.tables.records.ReceiptsRecord> getAllReceipts() {
    return dsl.selectFrom(generated.Tables.RECEIPTS).fetch();
}