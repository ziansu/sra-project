protected void writeValue(java.lang.String s) throws java.io.IOException {
    writeSize(s.length());
    os.write(s.getBytes());
    os.flush();
}