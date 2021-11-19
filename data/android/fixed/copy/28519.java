@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    mDrawerList.setItemChecked(position, true);
    mDrawerLayout.closeDrawer(mDrawerMenu);
    changeMovieCategory(mDrawerOptionsValue[position], true);
}