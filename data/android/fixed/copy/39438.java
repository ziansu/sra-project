public java.lang.String parseToKAF(ixa.kaflib.KAFDocument kaf) throws java.lang.Exception {
    parsedDoc = this.getParse(kaf);
    kaf.addConstituencyFromParentheses(parsedDoc.toString());
    return kaf.toString();
}