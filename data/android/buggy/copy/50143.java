@java.lang.Override
public void onProgressChanged(int progress) {
    short bassStrength = ((short) ((((float) (1000)) / 19) * progress));
    com.rks.musicx.data.Eq.BassBoosts.setBassBoostStrength(bassStrength);
}