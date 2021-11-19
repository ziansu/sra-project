@pt.ist.fenixframework.Atomic
private void createMenu(org.fenixedu.cms.domain.Site site, java.lang.String name) {
    org.fenixedu.cms.domain.Menu p = new org.fenixedu.cms.domain.Menu(site);
    p.setName(new org.fenixedu.commons.i18n.LocalizedString(org.fenixedu.commons.i18n.I18N.getLocale(), name));
}