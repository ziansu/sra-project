static void stopTransfer(int transferId) {
    synchronized(net.nitroshare.android.transfer.TransferWrapper.sActiveTransfers) {
        net.nitroshare.android.transfer.TransferWrapper transferWrapper = net.nitroshare.android.transfer.TransferWrapper.sActiveTransfers.get(transferId);
        if (transferWrapper != null) {
            transferWrapper.mTransfer.stop();
        }
    }
}