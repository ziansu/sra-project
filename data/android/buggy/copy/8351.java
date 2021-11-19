@java.lang.Override
public boolean onClose() {
    mOptionsMenu.findItem(R.id.action_show_result_list).setVisible(false);
    mLocationResultsArray.clear();
    rebuildMap();
    return false;
}