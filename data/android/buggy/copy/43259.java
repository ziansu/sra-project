@java.lang.Override
public void showAcceptButton(java.util.List<de.fau.cs.mad.wanthavers.common.Haver> havers) {
    if (isHaver(havers)) {
        android.view.MenuItem acceptDesireMitem = mOptionsMenu.findItem(R.id.menu_accept_desire);
        acceptDesireMitem.setVisible(false);
    }
}