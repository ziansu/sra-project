@java.lang.Override
public java.io.BufferedReader getSystemInAsBufferedReader() {
    return new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.System.in));
}