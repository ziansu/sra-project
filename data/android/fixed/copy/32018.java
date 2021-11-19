public com.raynigon.tscodemodel.types.TSAttribute Attribute(java.lang.String name, com.raynigon.tscodemodel.types.TSType type) {
    com.raynigon.tscodemodel.types.TSAttribute attr = new com.raynigon.tscodemodel.types.TSAttribute(this, name, type);
    attributes.put(name, attr);
    return attr;
}