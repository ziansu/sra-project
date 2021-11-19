private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    in.defaultReadObject();
    dataeaglealpha.timing.onesignal.OneSignalUser.userBiMap.put(oneSignalId, userId);
    (dataeaglealpha.timing.onesignal.OneSignalUser.userCounter)++;
}