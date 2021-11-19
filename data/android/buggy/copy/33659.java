private void verifySelectedItems(int position) {
    checkedItems[position] = false;
    for (boolean checked : checkedItems) {
        if (checked)
            return ;
        
    }
    activityCallback.hideContent();
}