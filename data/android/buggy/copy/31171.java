@java.lang.Override
public void onResume() {
    super.onResume();
    handler.postDelayed(runInt50, 20);
    showHint("hint_load_disks", R.string.hint_load_disks, 5);
}