public static java.lang.String getProperty(java.lang.String propertyName) {
    if ((com.gallatinsystems.common.util.PropertyUtil.props) == null) {
        new com.gallatinsystems.common.util.PropertyUtil();
    }
    return com.gallatinsystems.common.util.PropertyUtil.props.getProperty(propertyName);
}