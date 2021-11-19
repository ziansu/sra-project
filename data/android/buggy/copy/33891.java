@java.lang.Override
public java.lang.Object getProperty(java.lang.String name) {
    java.lang.Object value = properties.get(name);
    if (value != null) {
        return value;
    }
    return super.getProperty(name);
}