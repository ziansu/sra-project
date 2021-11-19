protected static java.lang.Object parseRaw(java.io.Reader in) throws java.io.IOException, org.json.simple.parser.ParseException {
    try {
        return org.mozilla.gecko.sync.ExtendedJSONObject.getJSONParser().parse(in);
    } catch (java.lang.Error e) {
        throw new org.json.simple.parser.ParseException(org.json.simple.parser.ParseException.ERROR_UNEXPECTED_EXCEPTION, e);
    }
}