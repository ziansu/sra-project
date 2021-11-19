@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Context context = v.getContext();
    android.content.Intent intent = new android.content.Intent(context, AlbumAdapter.MovieDetailsActivity.class);
    intent.putExtra(Constants.EXTRA_POSITION, getAdapterPosition());
    context.startActivity(intent);
}