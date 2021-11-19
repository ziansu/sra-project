public org.ektorp.ViewQuery key(java.lang.String s) {
    reset();
    key = org.ektorp.JSONEncoding.jsonEncode(s);
    return this;
}