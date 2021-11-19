private java.lang.String regexpFormatFixup(java.lang.String originRegexp) {
    java.lang.String fixedupRegexp = originRegexp;
    fixedupRegexp = extendedRegexpFixup(fixedupRegexp);
    debugPrint(("after extendedRegexpFixup: " + fixedupRegexp));
    fixedupRegexp = collectionFixedup(fixedupRegexp);
    debugPrint(("after collectionFixedup: " + fixedupRegexp));
    return originRegexp;
}