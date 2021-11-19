@java.lang.Override
public void onClick(android.view.View v) {
    if (!(mRadioManager.isPlaying()))
        mRadioManager.startRadio(RADIO_URL);
    else
        mRadioManager.stopRadio();
    
}