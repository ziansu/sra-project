@java.lang.Override
public int propertyInt(java.lang.String name) {
    return ((java.lang.Integer) (properties.get(name.toLowerCase())));
}