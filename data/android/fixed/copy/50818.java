public void updateVoiceSetting(java.lang.String voice) {
    mRealm.beginTransaction();
    mModel.setVocalizeVoice(voice);
    mRealm.commitTransaction();
}