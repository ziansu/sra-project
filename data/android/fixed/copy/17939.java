public java.lang.String parse(ixa.kaflib.KAFDocument kaf) throws java.io.IOException {
    parsedDoc = this.getParse(kaf);
    return parsedDoc.toString();
}