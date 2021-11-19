private static java.util.ResourceBundle getPokeBundle(java.lang.String bundleBaseName, java.util.Locale locale) throws java.util.MissingResourceException {
    return java.util.ResourceBundle.getBundle(bundleBaseName, locale, new java.util.ResourceBundle.Control() {
        @java.lang.Override
        public java.util.Locale getFallbackLocale(java.lang.String baseName, java.util.Locale locale) {
            return java.util.Locale.ENGLISH;
        }
    });
}