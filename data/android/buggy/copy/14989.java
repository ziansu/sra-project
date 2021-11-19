private void writeData(byte[] buf) throws java.io.IOException {
    android.util.Log.d(TAG, ("Sending: " + (java.util.Arrays.toString(buf))));
    m_device.write(buf, buf.length);
}