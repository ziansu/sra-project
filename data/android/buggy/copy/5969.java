@java.lang.Override
public javax.swing.JMenuItem getMenuPresenter() {
    menuItem = new javax.swing.JMenuItem(getName(), getIcon());
    menuItem.addActionListener(this);
    return menuItem;
}