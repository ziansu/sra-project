@java.lang.Override
public void onGroupSelected(java.lang.String groupName, java.lang.String groupOrder) {
    android.util.Log.i(com.github.charmasaur.alpsinsects.ui.MainActivity.TAG, ("Group selected: " + groupName));
    fragmentController.pushFragment(groupName, null, com.github.charmasaur.alpsinsects.ui.fragments.GroupFragment.newInstance(groupOrder), "GROUP", 4);
}