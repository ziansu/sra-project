@java.lang.Override
public void onResume() {
    super.onResume();
    imaController.onResume();
    player.setPlayWhenReady(true);
}