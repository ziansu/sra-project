@javax.annotation.Nullable
public static java.lang.String getCleanString(android.text.Editable editable) {
    java.lang.String str = editable.toString().trim();
    return (str.length()) > 0 ? str : null;
}