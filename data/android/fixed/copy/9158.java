private static java.lang.String getLanguage(android.content.Context context) {
    return com.akexorcist.localizationactivity.LanguageSetting.getLanguagePreference(context).getString(com.akexorcist.localizationactivity.LanguageSetting.KEY_LANGUAGE, com.akexorcist.localizationactivity.LanguageSetting.DEFAULT_LANGUAGE);
}