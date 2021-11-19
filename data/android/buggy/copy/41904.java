public java.lang.String toString(int indentSpaces) throws com.github.openjson.JSONException {
    com.github.openjson.JSONStringer stringer = new com.github.openjson.JSONStringer(indentSpaces);
    writeTo(stringer);
    return stringer.toString();
}