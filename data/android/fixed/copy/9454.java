private void addColumn(java.lang.String value) throws java.io.IOException {
    csvStream.write(",".getBytes(UTF8));
    addFirstColumn(value);
}