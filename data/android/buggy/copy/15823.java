private void showOverflowMenu(boolean showMenu) {
    if ((menu) == null)
        return ;
    
    menu.setGroupVisible(R.id.main_menu_group, showMenu);
}