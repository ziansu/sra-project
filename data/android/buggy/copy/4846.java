public java.lang.String translateSentencePlain(java.lang.String sent, tehthu.parser.Direction d) {
    tehthu.parser.Rope r = sanitizeAndRope(sent, d);
    tehthu.parser.Rope translated = translate(r, d);
    translated.debugRope();
    return translated.getText(false);
}