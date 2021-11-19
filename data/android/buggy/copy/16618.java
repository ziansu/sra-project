public void endSetup(java.lang.String s) throws java.lang.RuntimeException {
    getPlugin().getProxy().stop(s);
    throw new java.lang.IllegalArgumentException(s);
}