private void setUpRecyclerView() {
    recyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(this));
    recyclerView.setItemAnimator(new android.support.v7.widget.DefaultItemAnimator());
    recyclerView.addItemDecoration(new com.fibelatti.raffler.views.extensions.DividerItemDecoration(this, android.support.v7.widget.LinearLayoutManager.VERTICAL));
    recyclerView.setAdapter(adapter);
}