private void writeSingleNumber(java.lang.Double number) throws java.io.IOException {
    if (wroteLine) {
        writer.newLine();
    }
    wroteLine = true;
    writer.write(java.lang.String.format("<value>%1$,.2f</value>", number));
}