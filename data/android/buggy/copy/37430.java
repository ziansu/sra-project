@java.lang.Override
public void clickPosition(int position) {
    playBinder.onItemClickPosition(position);
    dl.closeDrawer(Gravity.LEFT, true);
}