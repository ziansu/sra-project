public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    mOpenTileFromLeftDrawer = true;
    onTileClicked(mDrawerAdapter.getTile(position));
}