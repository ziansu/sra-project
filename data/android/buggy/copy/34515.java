private java.lang.String buildScripts() {
    scripts.add("<script type='application/javascript' src='/scripts/template.js'></script>");
    java.lang.StringBuilder str = new java.lang.StringBuilder();
    for (java.lang.String line : scripts) {
        str.append((line + "\n"));
    }
    return str.toString();
}