@java.lang.Override
protected org.apache.isis.core.metamodel.adapter.ObjectAdapter load() {
    detach();
    final org.apache.isis.core.metamodel.adapter.ObjectAdapter results = executeAction();
    return results;
}