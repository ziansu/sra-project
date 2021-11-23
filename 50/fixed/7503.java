boolean checkBag(java.lang.String text) {
    java.util.regex.Matcher bagMatch = bagPattern.matcher(text);
    return bagMatch.matches();
}