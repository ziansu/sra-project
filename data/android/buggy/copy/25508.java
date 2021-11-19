public org.ektorp.ViewQuery startKey(java.lang.String s) {
    reset();
    startKey = org.ektorp.JSONEncoding.jsonEncode(s);
    return this;
}