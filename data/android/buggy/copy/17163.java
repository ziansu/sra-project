public void logSevere(java.lang.String s) {
    java.util.logging.Logger l = getPlugin().getLogger();
    if (l != null)
        l.severe(s);
    else
        java.lang.System.err.println(s);
    
}