@java.lang.Override
public void onClick() {
    contactDao.remove(item.getModelObject());
    setResponsePage(org.jboss.as.quickstarts.wicketWar.pages.ListContacts.class);
}