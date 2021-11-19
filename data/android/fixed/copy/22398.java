private static java.lang.String stripText(java.lang.String text) {
    java.util.regex.Matcher m = org.aiwolf.server.AIWolfGame.stripPattern.matcher(text);
    if (m.find()) {
        return m.group(1);
    }
    return text;
}