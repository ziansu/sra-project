public void finishWriteData() {
    if ((mFileOutputStream) != null) {
        try {
            mFileOutputStream.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}