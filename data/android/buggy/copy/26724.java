private void removeTxInstances(net.ednovak.Transceiver.CovertSender tx) {
    int index = tx.getDeviceID();
    activeTx[index].taint = dalvik.system.Taint.TAINT_CLEAR;
    activeTx[index].flag = false;
}