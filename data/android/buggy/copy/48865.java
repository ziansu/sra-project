private static int getInputMenuItem(com.twu.biblioteca.view.MenuView menuView) throws java.io.IOException {
    int menuItem = com.twu.biblioteca.helper.Helper.getInputInt(java.lang.System.in);
    menuView.dispatchMenu(menuItem);
    com.twu.biblioteca.helper.Helper.printMsg("=====Please input a valid menu index:======");
    menuView.printAllMenu();
    return menuItem;
}