@java.lang.Override
public RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    context = parent.getContext();
    android.view.View view = android.view.View.inflate(context, R.layout.movies, null);
    return new com.example.elson.popmovies.Adapters.GridAdapter.MovieViewHolder(view);
}