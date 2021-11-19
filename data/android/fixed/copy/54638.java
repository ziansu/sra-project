private static char getLastLetter(Proposition prop) {
    Proposition proposition = prop;
    java.lang.String propType = proposition.getType();
    char lastLetter = propType.charAt(((propType.length()) - 1));
    return lastLetter;
}