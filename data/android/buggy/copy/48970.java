@java.lang.Override
public void onPause() {
    super.onPause();
    imaController.onPause();
    player.setPlayWhenReady(false);
}