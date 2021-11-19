private void setUpRecyclerView() {
    adapter = new com.blstream.studybox.decks_view.DecksAdapter();
    adapter.setOnItemClickListener(this);
    recyclerView.setAdapter(adapter);
    recyclerView.setLayoutManager(new android.support.v7.widget.GridLayoutManager(this, columnQuantity));
    recyclerView.setHasFixedSize(true);
}