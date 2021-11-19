private java.io.StringWriter writeBindingConfig(org.milyn.ejc.ClassModel model) throws java.io.IOException, java.lang.ClassNotFoundException {
    org.milyn.ejc.BindingWriter writer = new org.milyn.ejc.BindingWriter(model);
    java.io.StringWriter result = new java.io.StringWriter();
    writer.writeBindingConfig(result);
    return result;
}