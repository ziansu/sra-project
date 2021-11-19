public static simple.ml.Page parse(final java.io.Reader in) throws java.io.IOException, java.text.ParseException {
    return simple.ml.InlineLooseParser.parse(in, new simple.ml.ParserConstants());
}