public java.lang.Double getDouble(java.lang.Double def) {
    java.lang.Double result = new org.apache.commons.beanutils.converters.FloatConverter(null).convert(java.lang.Double.class, value);
    if (result != null) {
        return result * (getMultiplier());
    }else {
        return def;
    }
}