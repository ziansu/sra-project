public void enterScope() {
    java.lang.System.out.println("Entering scope:");
    hash = new java.util.Hashtable<java.lang.String, java.lang.Object>();
    scopes.add(hash);
    java.lang.System.out.println(scopes);
}