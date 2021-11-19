private java.lang.String nullCheck(java.lang.String string) {
    return isEmpty(string) ? getString(R.string.unknown) : string;
}