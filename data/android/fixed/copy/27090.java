@java.lang.Override
protected java.lang.Object convert(com.google.api.services.datastore.DatastoreV1.Entity entityPb) {
    if ((entityPb.getPropertyCount()) == 0) {
        if (!(entityPb.hasKey())) {
            return null;
        }
    }
    return null;
}