public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    position = position - 1;
    onTileClicked(mDrawerAdapter.getTile(position));
}