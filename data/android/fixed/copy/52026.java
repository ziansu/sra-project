@java.lang.Override
public org.opendaylight.controller.md.sal.dom.api.DOMTransactionChain createPeerChain(final org.opendaylight.controller.md.sal.common.api.data.TransactionChainListener listener) {
    return this.domDataBroker.createTransactionChain(listener);
}