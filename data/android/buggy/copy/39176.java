public void setItems(final it.sephiroth.android.library.bottomnavigation.BottomNavigationItem[] items) {
    this.items = items;
    this.shifting = (null != items) && ((items.length) > 3);
}