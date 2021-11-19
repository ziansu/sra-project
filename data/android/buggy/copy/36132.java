@java.lang.Override
protected void onResume() {
    super.onResume();
    passDataToDetailFragment(findViewById(R.id.detailF));
    passDataToGraphFragment(findViewById(R.id.graphicF));
}