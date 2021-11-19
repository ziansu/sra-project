@java.lang.Override
public org.apache.ignite.binary.BinaryObjectBuilder setField(java.lang.String name, @org.jetbrains.annotations.Nullable
org.apache.ignite.binary.BinaryObjectBuilder builder) {
    if (builder == null)
        return setField(name, null, java.lang.Object.class);
    else
        return setField(name, ((java.lang.Object) (builder)));
    
}