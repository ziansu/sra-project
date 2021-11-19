private void save(java.lang.String filename, java.lang.String data) {
    save(filename, data.getBytes(), java.lang.System.currentTimeMillis());
}