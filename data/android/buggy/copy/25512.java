@java.lang.Override
protected javafx.scene.control.Menu addNonLeafToTop(org.scijava.menu.ShadowMenu sm, javafx.scene.control.MenuBar t) {
    javafx.scene.control.Menu newMenu = new javafx.scene.control.Menu(sm.getName());
    menuMap.put(sm, newMenu);
    t.getMenus().add(newMenu);
    return newMenu;
}