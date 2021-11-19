@java.lang.Override
public void onBindViewHolder(com.example.android.popularmovies.TrailerRecyclerViewAdapter.TrailerViewHolder holder, int position) {
    android.util.Log.d(com.example.android.popularmovies.TrailerRecyclerViewAdapter.TAG, ("#" + position));
    com.example.android.popularmovies.TrailerObject currentTrailer = myTrailerData[position];
    holder.trailerNameView.setText(currentTrailer.getName());
}