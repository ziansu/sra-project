@java.lang.Override
public void onNothingSelected(android.widget.AdapterView<?> parent) {
    if ((videoAdapter) == null) {
        videoAdapter = ((com.example.inspired.inspiredvideo.app.MovieAdapter) (mRecyclerView.getAdapter()));
    }
    videoAdapter.updatemVideoItems(Context.mCurrentData, false);
}