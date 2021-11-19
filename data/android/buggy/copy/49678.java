public void createEntity(java.lang.String entityId, java.lang.String name) throws java.lang.Exception {
    java.lang.System.out.println(((entityId + " ") + name));
    assertUndeclared(entityId);
    declaredVariables.put(entityId, name);
}