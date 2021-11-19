protected void closeRealm() {
    myRealm.close();
    android.util.Log.d(com.zhan.budget.Fragment.BaseRealmFragment.TAG, "----- CLOSE REALM -----");
}