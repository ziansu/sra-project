public int getTakeOffAlarmID() {
    mPreferences.getInt(mContext.getString(R.string.takeOffAlarmID), (-1));
    return mTakeOffAlarmID;
}