public void removeShortSoundTrack(int track) {
    modelControl.removeTrack(track);
    mActiveShortSound.removeTrack(mActiveShortSound.getTracks().get(track));
}