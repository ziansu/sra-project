protected boolean validType(java.lang.String exp, java.lang.String found) {
    return ((found.equals("Unknown")) || (found.equals(exp))) || (exp.equals("any"));
}