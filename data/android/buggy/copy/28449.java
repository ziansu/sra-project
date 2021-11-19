@java.lang.Override
public void onSuccess(java.util.List<org.roda.core.data.v2.ip.TransferredResource> result) {
    doTransferredResourceMove(result, resource.isFile());
}