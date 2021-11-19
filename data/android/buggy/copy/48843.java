public java.lang.String getYWSeqValue(java.lang.String str) {
    com.google.common.base.CharMatcher charMatcher = com.google.common.base.CharMatcher.anyOf(str.toUpperCase());
    return charMatcher.retainFrom("ATCGUINBDHKMRSWYV");
}