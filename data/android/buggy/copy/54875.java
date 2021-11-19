@java.lang.Override
public void onMasterPasswordDialogNegativeClick(java.lang.String password) {
    selectedItem = lastSelectedItem;
    navigationView.getMenu().getItem(0).getSubMenu().getItem(selectedItem).setChecked(true);
}