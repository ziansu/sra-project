public void populateAdapter(java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> pathAndDataMap) {
    adapter = new comquintonj.github.atlantastreetartproject.MyAdapter(this.getApplicationContext(), pathAndDataMap);
    mRecyclerView.setAdapter(adapter);
}