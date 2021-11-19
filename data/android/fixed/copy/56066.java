@java.lang.Override
public void onPostExecute(java.lang.String success) {
    if ((mView) != null)
        mView.doDataLoadingAsnc();
    
}