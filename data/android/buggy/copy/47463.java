@java.lang.Override
public void onSpeedChanged(nuclei.media.MediaInterface mediaInterface, float s) {
    speed.setText(nuclei.media.ResourceProvider.getInstance().getSelectedSpeed());
}