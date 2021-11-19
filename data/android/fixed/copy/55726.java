@java.lang.Override
public void run() {
    listener.onProgress(key, bytesRead, contentLength);
}