@java.lang.Override
public void onNothingSelected(android.widget.AdapterView<?> parent) {
    com.example.inspired.inspiredvideo.app.MovieAdapter videoAdapter = ((com.example.inspired.inspiredvideo.app.MovieAdapter) (mRecyclerView.getAdapter()));
    videoAdapter.updatemVideoItems(Context.mCurrentData, false);
}