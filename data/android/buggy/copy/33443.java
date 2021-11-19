public static void handlePowerGroupListener(com.google.firebase.database.ChildEventListener childEventListener, java.lang.String groupName) {
    android.util.Log.d(tomi.piipposoft.blankspellbook.PowerList.PowerListPresenter.TAG, ("handlePowerGroupListener: added new listener: " + childEventListener));
    tomi.piipposoft.blankspellbook.PowerList.PowerListPresenter.powerGroupListeners.put(childEventListener, groupName);
}