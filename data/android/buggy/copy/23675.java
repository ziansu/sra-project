private void findCloneMethod() {
    try {
        iCloneMethod = iPrototype.getClass().getMethod("clone", null);
    } catch (java.lang.NoSuchMethodException ex) {
        throw new java.lang.IllegalArgumentException("PrototypeCloneFactory: The clone method must exist and be public ");
    }
}