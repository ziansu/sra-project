public static simple.ml.Page parse(final java.lang.CharSequence src) throws java.io.IOException, java.text.ParseException {
    return simple.ml.InlineLooseParser.parse(src, new simple.ml.ParserConstants(), true);
}