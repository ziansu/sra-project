@java.lang.Override
public void enableDisableUser(com.holz.web.models.Locale locale, int farmId) {
    this.localeDao.enableDisableLocale(locale, farmId);
}