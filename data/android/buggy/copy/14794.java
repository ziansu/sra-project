public void setLanguage(java.lang.String language) {
    this.language = language;
    config.changeConfiguration("language", language);
    java.lang.System.out.println(language);
}