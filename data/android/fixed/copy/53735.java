private void showEditDialog(info.dylansymons.fpfrhelper.player.Player player) {
    android.app.DialogFragment fragment = info.dylansymons.fpfrhelper.game.management.NewPlayerDialogFragment.newEditInstance(mGame, mColourList, this, player);
    fragment.show(getFragmentManager(), "dialog");
}