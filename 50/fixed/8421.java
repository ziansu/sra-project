public void refreshList() {
    content.clear();
    content.addAll(com.randomappsinc.studentpicker.Misc.PreferencesManager.get().getNameLists());
    java.util.Collections.sort(content);
    setNoContent();
    notifyDataSetChanged();
}