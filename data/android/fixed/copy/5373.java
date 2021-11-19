@java.lang.Override
protected void onResume() {
    super.onResume();
    myAdapter = new com.example.maks.database.adapters.MyAdapter(this, com.example.maks.database.App.getInstance().getDb());
    listView.setAdapter(myAdapter);
    myAdapter.notifyDataSetChanged();
}