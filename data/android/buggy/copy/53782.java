public java.util.Optional<java.lang.String[]> getTemplatesNames(java.util.Properties properties) {
    if (properties == null) {
        throw new java.lang.IllegalArgumentException("Properties are required!");
    }
    return parser.getArray(properties, net.remotehost.domdetective.parser.TemplateParser.TEMPLATE_LIST_NAME, ",");
}