private void expand() {
    java.lang.Object[] newOne = new java.lang.Object[(size) * 2];
    java.lang.System.arraycopy(data, 0, newOne, 0, data.length);
    data = newOne;
}