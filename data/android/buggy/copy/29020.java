private void writeFootOfTheFile(java.io.BufferedWriter writer) throws java.io.IOException {
    java.lang.String head = "</test>\n" + ("</tests>\n" + "</form>\n");
    writer.write(head.toCharArray());
}