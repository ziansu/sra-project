@java.lang.Override
public com.example.raf0c.movies.adapters.ImageItemAdapter.ImagesViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
    android.view.View v = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.image_list_item, viewGroup, false);
    com.example.raf0c.movies.adapters.ImageItemAdapter.ImagesViewHolder pvh = new com.example.raf0c.movies.adapters.ImageItemAdapter.ImagesViewHolder(v, listener);
    return pvh;
}