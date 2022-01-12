protected org.nuxeo.functionaltests.contentView.ContentViewElement reload(java.lang.String id) {
    return getWebFragment(org.openqa.selenium.By.id(id), org.nuxeo.functionaltests.contentView.ContentViewElement.class);
}