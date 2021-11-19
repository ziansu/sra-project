public void parse(ixa.kaflib.KAFDocument kaf) throws java.io.IOException {
    parsedDoc = this.getParse(kaf);
    java.lang.System.out.print(parsedDoc.toString());
}