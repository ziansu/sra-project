public org.apache.roller.weblogger.ui.core.menu.Menu getMenu() {
    return menuHelper.getMenu(getDesiredMenu(), getAuthenticatedUser().getGlobalRole(), getActionWeblogRole(), getActionName(), true);
}