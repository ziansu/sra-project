@java.lang.Override
public com.nabwera.filamuapp.adapter.MoviesAdapter.MyViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
    android.view.View view = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.movie_card, viewGroup, false);
    return new com.nabwera.filamuapp.adapter.MoviesAdapter.MyViewHolder(view);
}