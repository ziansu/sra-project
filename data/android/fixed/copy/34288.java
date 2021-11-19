@java.lang.Override
public void onResume() {
    super.onResume();
    player.setPlayWhenReady(true);
    if ((imaController) != null) {
        imaController.onResume();
    }
}