static java.lang.String getLocalizedCode() {
    if ((com.dev.amazonadvisor.AmazonLocaleUtils.locale) == null)
        com.dev.amazonadvisor.AmazonLocaleUtils.locale = com.dev.amazonadvisor.AmazonLocaleUtils.getLocale(com.dev.amazonadvisor.AmazonLocaleUtils.context);
    
    return com.dev.amazonadvisor.AmazonLocaleUtils.locale.getLanguage();
}