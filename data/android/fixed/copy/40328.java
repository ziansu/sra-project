public void writeTo(java.io.File dexOut) throws java.io.IOException {
    try (java.io.OutputStream out = new java.io.FileOutputStream(dexOut)) {
        writeTo(out);
    }
}