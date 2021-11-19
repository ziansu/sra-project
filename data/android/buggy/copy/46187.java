private void storeLocalizedAttributeName(long key, java.lang.String attributeName, java.lang.String language) {
    if (org.apache.commons.lang3.StringUtils.isBlank(attributeName)) {
        return ;
    }
    localizer.storeLocalizedResource(language, key, LocalizedObjectTypes.CUSTOM_ATTRIBUTE_NAME, attributeName);
}