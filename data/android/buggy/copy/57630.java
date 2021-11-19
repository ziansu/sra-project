protected void closeRealm() {
    if (((myRealm) != null) && (!(myRealm.isClosed()))) {
        myRealm.close();
        android.util.Log.d(com.zhan.budget.Fragment.BaseRealmFragment.TAG, "----- CLOSE REALM -----");
    }
}