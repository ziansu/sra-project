private void setGrid() {
    layoutManager = new android.support.v7.widget.GridLayoutManager(activity, 2);
    recyclerView.setLayoutManager(layoutManager);
    recyclerView.setAdapter(photoAdapter);
}