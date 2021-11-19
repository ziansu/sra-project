@java.lang.Override
public void onResume() {
    super.onResume();
    setUserVisibleHint(true);
    initLayout();
    toolbarManager.drawMenu(new com.sundown.maplists.pojo.MenuOption(MenuOption.GroupView.EDIT_DELETE, true));
}