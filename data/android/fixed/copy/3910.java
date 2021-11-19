public void write(java.lang.String transactionNum) throws java.io.IOException {
    this.write();
    java.io.FileWriter wr = new java.io.FileWriter(this.customer, true);
    wr.write(("\n" + transactionNum));
    wr.close();
}