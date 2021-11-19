public com.icfolson.sling.translate.runtime.repository.impl.TranslationNode createTranslation(final java.lang.String translationKey) {
    if (translations.containsKey(translationKey)) {
        throw new java.lang.IllegalStateException("Attempting to create existing translation");
    }
    return doCreateTranslation(translationKey);
}