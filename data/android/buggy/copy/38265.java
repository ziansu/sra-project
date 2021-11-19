private boolean isDuplicatedLanguageSetting(java.lang.String language) {
    return language.toLowerCase(java.util.Locale.getDefault()).equals(com.akexorcist.localizationactivity.LanguageSetting.getLanguage(this));
}