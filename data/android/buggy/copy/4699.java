public static java.lang.String checkNullString(com.quinsoft.zeidon.Application app, java.lang.Object string) {
    if (string == null)
        return app.nullStringEqualsEmptyString() ? com.quinsoft.zeidon.domains.StringDomain.EMPTY_STRING : null;
    
    if (string.equals(com.quinsoft.zeidon.domains.StringDomain.EMPTY_STRING))
        return com.quinsoft.zeidon.domains.StringDomain.EMPTY_STRING;
    
    return string.toString();
}