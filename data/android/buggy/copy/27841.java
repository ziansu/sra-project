private java.lang.String nullCheck(java.lang.String string) {
    return ((string == null) || (string.equals(""))) || (string.equals("0-00-00")) ? getString(R.string.unknown) : string;
}