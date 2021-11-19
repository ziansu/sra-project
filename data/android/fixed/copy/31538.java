public org.apache.roller.weblogger.ui.core.menu.Menu getMenu() {
    return menuHelper.getMenu(getAuthenticatedUser().getGlobalRole(), getActionWeblogRole(), getActionName(), true);
}