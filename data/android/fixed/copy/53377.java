@java.lang.Override
public int propertyInt(java.lang.String name) {
    java.lang.Object i = properties.get(name.toLowerCase());
    return ((java.lang.Integer) (i == null ? 0 : i));
}