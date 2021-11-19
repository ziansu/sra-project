private com.flipkart.fdp.migration.distcp.state.TransferStatus checkTransferStatus() {
    com.flipkart.fdp.migration.distcp.state.TransferStatus stat = transferStatus.get(srcPath);
    if ((stat != null) && ((stat.getStatus()) == (com.flipkart.fdp.migration.db.models.Status.COMPLETED))) {
        return stat;
    }
    return null;
}