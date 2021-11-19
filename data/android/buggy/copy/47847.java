@java.lang.Override
public org.spine3.server.storage.datastore.dsnative.Namespace getNamespace() {
    return org.spine3.server.storage.datastore.dsnative.SingleTenantNamespaceSupplier.NamespaceSingleton.INSTANCE.value;
}