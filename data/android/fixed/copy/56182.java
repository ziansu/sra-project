protected void resumeRealm() {
    myRealm = io.realm.Realm.getDefaultInstance();
    android.util.Log.d(com.zhan.budget.Fragment.BaseRealmFragment.TAG, "----- RESUME REALM -----");
}