private void onPeerDown() {
    final org.opendaylight.controller.md.sal.dom.api.DOMDataWriteTransaction wTx = this.domTxChain.newWriteOnlyTransaction();
    wTx.delete(LogicalDatastoreType.OPERATIONAL, this.peerYangIId);
    wTx.submit();
    close();
}