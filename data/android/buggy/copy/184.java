public void addQualifier(final java.lang.annotation.Annotation qualifier) {
    qualifiers.add(qualifier);
    qualifiers.remove(org.jboss.errai.ioc.client.container.FactoryHandleImpl.DEFAULT);
}