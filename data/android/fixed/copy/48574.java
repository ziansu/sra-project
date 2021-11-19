private java.lang.String removePunctuation(java.lang.String token) {
    java.lang.System.out.println(token);
    java.util.regex.Pattern p = java.util.regex.Pattern.compile(puncReg);
    java.util.regex.Matcher m = p.matcher(token);
    return m.replaceAll("");
}