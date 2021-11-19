public static boolean istErstesHalbjahr(int monat) {
    if ((monat < 1) || (monat > 12))
        throw new java.lang.IllegalArgumentException();
    
    if (monat < 7)
        return true;
    
    return false;
}