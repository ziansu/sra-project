protected void parseProperty(org.mybatis.generator.config.PropertyHolder propertyHolder, org.w3c.dom.Node node) {
    java.util.Properties attributes = parseAttributes(node);
    java.lang.String name = attributes.getProperty("name");
    java.lang.String value = attributes.getProperty("value");
    propertyHolder.addProperty(name, value);
}