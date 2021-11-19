public static com.github.twoleds.configuration.Configuration parse(java.lang.String configuration) throws com.github.twoleds.configuration.ConfigurationException {
    try (com.github.twoleds.configuration.ConfigurationParser parser = new com.github.twoleds.configuration.ConfigurationParser(new java.io.StringReader(configuration))) {
        return parser.parse();
    } catch (java.io.IOException ignored) {
        return null;
    }
}