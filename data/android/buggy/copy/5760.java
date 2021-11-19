@java.lang.Override
public java.lang.String getOptionalStringProperty(java.lang.String propName) {
    try {
        return props.getString(propName);
    } catch (java.util.MissingResourceException mre) {
        return "";
    }
}