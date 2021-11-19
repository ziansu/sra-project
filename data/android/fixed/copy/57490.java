@java.lang.Override
public void onMasterVolumeChanged(final float pMasterVolume) throws org.andengine.audio.sound.exception.SoundReleasedException {
    this.setVolume(this.mLeftVolume, this.mRightVolume);
}