@java.lang.Override
public java.lang.String toString() {
    try {
        com.github.openjson.JSONStringer stringer = new com.github.openjson.JSONStringer();
        writeTo(stringer);
        return stringer.toString();
    } catch (com.github.openjson.JSONException e) {
        return null;
    }
}