public void updateData() {
    android.widget.GridView gridView = ((android.widget.GridView) (findViewById(R.id.gridview)));
    Adapter = new com.onelio.myuacloud.Apps.AdAdapter(getBaseContext(), data);
    gridView.setVisibility(View.VISIBLE);
    gridView.setAdapter(Adapter);
}