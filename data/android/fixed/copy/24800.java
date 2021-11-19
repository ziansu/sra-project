@java.lang.Override
public void onAdsDataReceived(int[] dataFrame) {
    try {
        bdfWriter.writeDataRecord(dataFrame);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}