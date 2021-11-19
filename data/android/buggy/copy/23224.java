@java.lang.Override
public void onResume() {
    super.onResume();
    if ((mListState) != null)
        linearLayoutManager.onRestoreInstanceState(mListState);
    
}