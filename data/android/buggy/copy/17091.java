public java.lang.String getLastAuthLink() {
    java.lang.String authLink = adminportal.Actions.getText(common.AdminPortalBrowser.Instance(), adminportal.ConsumerDetailsPage.lastValueInTable(ConsumerDetailsTable.AUTH_LINK, ConsumerDetailsColumn.AUTH_LINK), "text");
    return authLink += " ";
}