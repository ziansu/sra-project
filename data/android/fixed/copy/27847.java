public de.daug.semanticchess.Parser.Helper.Classes getClassByName(java.lang.String name) {
    for (de.daug.semanticchess.Parser.Helper.Classes c : classes) {
        if (c.getClassesName().equals(name)) {
            return c;
        }
    }
    return null;
}