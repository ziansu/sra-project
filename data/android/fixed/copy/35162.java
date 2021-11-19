public boolean test(final java.lang.String o) {
    return (o != null) && (regex.matcher(o).matches());
}