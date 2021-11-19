public void writeTo(java.io.File dexOut) throws java.io.IOException {
    java.io.OutputStream out = new java.io.FileOutputStream(dexOut);
    writeTo(out);
    out.close();
}