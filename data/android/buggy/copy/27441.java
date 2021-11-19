private static final net.sourceforge.kolmafia.persistence.MonsterDatabase.Element parseElement(final java.lang.String s) {
    for (net.sourceforge.kolmafia.persistence.MonsterDatabase.Element elem : net.sourceforge.kolmafia.persistence.MonsterDatabase.Element.values()) {
        if (elem.toString().equals(s)) {
            return elem;
        }
    }
    return net.sourceforge.kolmafia.persistence.MonsterDatabase.Element.NONE;
}