@java.lang.Override
protected void doBind(org.springframework.beans.MutablePropertyValues propertyValues) {
    propertyValues = modifyProperties(propertyValues, getTarget());
    getPropertyEditorRegistry().registerCustomEditor(java.net.InetAddress.class, new org.springframework.boot.bind.InetAddressEditor());
    super.doBind(propertyValues);
}