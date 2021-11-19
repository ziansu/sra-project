public java.lang.String getModifier() {
    for (java.lang.String mod : modifiers) {
        if (mod.equals("final")) {
            return "final-";
        }
    }
    return "";
}