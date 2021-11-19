public void updateSpeakerVolume(int speakerVolume) {
    if ((mWheelSpeakerVolume) != speakerVolume) {
        com.cooper.wheellog.utils.InMotionAdapter.getInstance().setSpeakerVolumeState(speakerVolume);
    }
}