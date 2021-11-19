@java.lang.Override
public void onResponse(com.example.vineetpatil.moviesearch.TitleRecord response) {
    android.util.Log.d(com.example.vineetpatil.moviesearch.SearchFragment.TAG, ("TitleRecordListener - onResponse : " + (response.toString())));
    addTitleRecord(response);
}