@java.lang.Override
public void showData(java.util.List<com.pratilipi.mobile.android.datafiles.Pratilipi> pratilipiList) {
    if (pratilipiList != null)
        mRecentReadsAdapter.addItems(pratilipiList);
    
    hideProgressIndicator();
}