@java.lang.Override
public javax.swing.JMenuItem getMenuPresenter() {
    menuItem = super.getMenuPresenter();
    menuItem.addActionListener(this);
    return menuItem;
}