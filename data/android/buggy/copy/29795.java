@java.lang.Override
protected void onResume() {
    super.onResume();
    newsDetailSupplier.setKey(java.lang.String.valueOf(newsDetail.getNewsId()));
    repository.addUpdatable(this);
}