@java.lang.Override
public void onRefresh() {
    new com.afn.onthego.async.LearnRequest(this).execute();
}