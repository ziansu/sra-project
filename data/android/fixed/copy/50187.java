@java.lang.Override
protected void doBind(org.springframework.beans.MutablePropertyValues propertyValues) {
    getPropertyEditorRegistry().registerCustomEditor(java.net.InetAddress.class, new org.springframework.boot.bind.InetAddressEditor());
    super.doBind(modifyProperties(propertyValues, getTarget()));
}