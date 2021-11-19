private java.lang.String onlyLeaveLettersAndNumbers(java.lang.String s) {
    s = s.replaceAll("[^a-zA-Z0-9]", "");
    return s;
}