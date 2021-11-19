private void showAddDialog() {
    android.app.DialogFragment fragment = info.dylansymons.fpfrhelper.game.management.NewPlayerDialogFragment.newInstance(mGame.getFirefighterList(), mColourList, this);
    fragment.show(getFragmentManager(), "dialog");
}