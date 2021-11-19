@java.lang.Override
public void menu(gum.User u) throws gum.menus.MenuExitException {
    if (!(actionPerformed)) {
        this.configMenu(u);
    }else {
        this.performMenu(u);
    }
}