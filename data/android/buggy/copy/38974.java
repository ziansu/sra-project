@java.lang.Override
public void onProgress(int bytesWritten, int totalSize) {
    super.onProgress(bytesWritten, totalSize);
    updateProgressBar(bytesWritten, totalSize);
}