@java.lang.Override
public void onBackPressed() {
    if ((mCanBlockManager) != null) {
        if (!(mCanBlockManager.onBackPressed())) {
            super.onBackPressed();
        }
    }
}