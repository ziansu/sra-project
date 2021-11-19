@javax.annotation.Nullable
static java.lang.String getCleanString(java.lang.String str) {
    if (str == null) {
        return null;
    }else {
        str = str.trim();
        return (str.length()) > 0 ? str : null;
    }
}