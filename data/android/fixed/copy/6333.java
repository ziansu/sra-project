@java.lang.Override
public void onSettingsChanged() {
    volume = ((com.retroMachines.RetroMachines) (Gdx.app.getApplicationListener())).getSettingController().getVolume();
    if ((music) != null) {
        music.setVolume(volume);
    }
}