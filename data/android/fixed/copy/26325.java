public void setLoop(boolean looping) {
    if (looping) {
        Pad.mSoundPoolHelper.setLoop(true);
    }else {
        Pad.mSoundPoolHelper.setLoop(false);
    }
}